// src/components/UniversityManagement.jsx
import React, { useState, useEffect } from 'react';
import api from '../services/api';

const UniversityManagement = () => {
    const [section, setSection] = useState('home');
    const [data, setData] = useState([]);

    const fetchData = async (section) => {
        try {
            const response = await api.get(`/${section}`);
            setData(response.data);
        } catch (error) {
            console.error('Error fetching data:', error);
        }
    };

    useEffect(() => {
        if (section !== 'home') fetchData(section);
    }, [section]);

    return (
        <div>
            <h1>University Management</h1>
            <button onClick={() => setSection('course')}>Course</button>
            <button onClick={() => setSection('professor')}>Professor</button>
            <button onClick={() => setSection('university')}>University</button>

            <table>
                <thead>
                <tr>
                    {data.length > 0 && Object.keys(data[0]).map((key) => (
                        <th key={key}>{key}</th>
                    ))}
                    <th>Actions</th>
                </tr>
                </thead>
                <tbody>
                {data.map((item, index) => (
                    <tr key={index}>
                        {Object.values(item).map((value, i) => (
                            <td key={i}>{value}</td>
                        ))}
                        <td>
                            <button>Edit</button>
                            <button>Delete</button>
                        </td>
                    </tr>
                ))}
                </tbody>
            </table>
        </div>
    );
};

export default UniversityManagement;
