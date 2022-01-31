import React, { useState } from "react";
import "./login.css";

export default () => {
    const [userName, setUserName] = useState("");
    const [password, setPassword] = useState("");

    const [allEntry, setAllEntry] = useState([]);

    const submitForm = (e) => {
        e.preventDefault();
        const newEntry = { userName: userName, password: password };

        //just need to send the userdata to backend
        setAllEntry([...allEntry, newEntry]);
        console.log(...allEntry);
    };

    return (
        <>
            <div id="container">
                <form action="" onSubmit={submitForm}>
                    <div>
                        <label htmlFor="username">Username</label>
                        <input
                            type="text"
                            name="username"
                            id="username"
                            value={userName}
                            onChange={(e) => setUserName(e.target.value)}
                        ></input>
                    </div>
                    <div>
                        <label htmlFor="password">Password</label>
                        <input
                            type="password"
                            name="password"
                            id="password"
                            value={password}
                            onChange={(e) => setPassword(e.target.value)}
                        ></input>
                    </div>

                    <button type="submit">Login</button>
                </form>

                {
                    allEntry.map((curElem) =>{
                        return (
                            <div id="entry">
                                <p>{curElem.userName}</p>
                                <p>{curElem.password}</p>
                            </div>
                        )
                    })
                }

            </div>
        </>
    );
};
