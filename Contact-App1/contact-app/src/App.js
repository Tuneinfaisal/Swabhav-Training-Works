import "./App.css";
import React, { useEffect, useState } from "react";

function App() {
    const [name, setName] = useState("");
    const [place, setPlace] = useState("");

    function saveUser() {
        console.warn(name, place);
        fetch();
    }

    return (
        <div className="App">
            <input
                type="text"
                value={name}
                placeholder="Enter name"
                onChange={(e) => {
                    setName(e.target.value);
                }}
                name="name"
            />{" "}
            <br /> <br />
            <input
                type="text"
                value={place}
                placeholder="Enter name"
                onChange={(e) => {
                    setPlace(e.target.value);
                }}
                name="place"
            />{" "}
            <br /> <br />
            <button type="button" onClick={saveUser}>
                Submit
            </button>
        </div>
    );
}

export default App;
