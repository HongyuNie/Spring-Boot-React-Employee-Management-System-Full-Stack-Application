import React from 'react'

const ListEmployeeComponent = () => {
    const dummyData = [
        {
            "id":1,
            "fistName":"Alice",
            "lastName":"alice@gmail.com"
        },
        {
            "id":2,
            "fistName":"Ali",
            "lastName":"ali@gmail.com"
        },
        {
            "id":3,
            "fistName":"Alison",
            "lastName":"alison@gmail.com"
        }
    ]
    
  return (
    <div className='container'>
        <h2 className='text-center'>List of Employees</h2>
        <table className='table table-striped table-bordered'>
            <thead>
                <tr>
                    <th>Employee ID</th>
                    <th>Employee First Name</th>
                    <th>Employee Last Name</th>
                    <th>Employee Email</th>
                </tr>
                
            </thead>
            <tbody>
                {
                    dummyData.map(employee => 
                                    <tr key={employee.id}>
                                        <td>{employee.id}</td>
                                        <td>{employee.fistName}</td>
                                        <td>{employee.lastName}</td>
                                        <td>{employee.email}</td>
                                    </tr>)
                }
            </tbody>
        </table>
    </div>
  )
}

export default ListEmployeeComponent