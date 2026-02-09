import React, { useState } from "react";
import axios from "axios";

function Login() {

  // State Variables
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");

  // Login Function
  const handleLogin = async () => {

    // Basic Validation
    if (!username || !password) {
      alert("Please enter username and password");
      return;
    }

    try {

      // API Call to Spring Boot
      const response = await axios.post(
        "http://localhost:2011/api/saveUser",
        {
          username: username,
          password: password
        }
      );

      // Show Response Message
      alert(response.data);

    } catch (error) {
      console.error(error);
      alert("Server Error / Backend not running");
    }
  };

  // UI JSX
  return (
    <div className="login-container">
      <h2>Login</h2>

      <input
        type="text"
        placeholder="Enter Username"
        value={username}
        onChange={(e) => setUsername(e.target.value)}
      />

      <input
        type="password"
        placeholder="Enter Password"
        value={password}
        onChange={(e) => setPassword(e.target.value)}
      />

      <button onClick={handleLogin}>
        Login
      </button>
    </div>
  );
}

export default Login;
