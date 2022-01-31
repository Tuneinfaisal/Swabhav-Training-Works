import React, { useState } from "react";

export default () => {

    const [userName, setUserName] = useState("");

    const submitForm = (e) => {
        e.preventDefault();
        
        let hrs = new Date().getHours();
        let time = hrs<12? "morning" : "evening";
        const greetingMessage = `Hello ${userName}, Good ${time}`;

        console.log(greetingMessage);

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

                    <button type="submit">Login</button>
                </form>


            </div>
        </>
    );
};