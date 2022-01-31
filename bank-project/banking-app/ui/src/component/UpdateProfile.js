import axios from "axios";
import React, { useRef } from "react";
import { useEffect } from "react/cjs/react.development";

const UpdateProfile = (props) => {
  const firstNameInputRef = useRef();
  const lastNameInputRef = useRef();
  const emailInputRef = useRef();
  const phoneNoInputRef = useRef();
  const passwordInputRef = useRef();
  const accountNoInputRef = useRef();

  useEffect(async () => {
    const resp = await axios.get(
      `http://localhost:8000/api/v1/account/user/${props.logedinUser}`
    );
    console.log(resp);
    firstNameInputRef.current.value = resp.data.firstName;
    lastNameInputRef.current.value = resp.data.lastName;
    emailInputRef.current.value = resp.data.email;
    phoneNoInputRef.current.value = resp.data.phone;
    accountNoInputRef.current.value = resp.data.accno;
  }, [props.logedinUser]);
  const updateHandler = (event) => {
    event.preventDefault();
    const enteredFirstName = firstNameInputRef.current.value;
    const enteredLastName = lastNameInputRef.current.value;
    const enteredEmail = emailInputRef.current.value;
    const enteredphone = phoneNoInputRef.current.value;
    const enteredPassword = passwordInputRef.current.value;
    const accountNo = accountNoInputRef.current.value;
  };

  return (
    <div className="card">
      <form>
        <div className="form-group ">
          <label htmlFor="firstName">Account No :</label>
          <input
            id="firstName"
            type="text"
            value={accountNoInputRef}
            ref={accountNoInputRef}
            className="form-control"
            readOnly
          />
        </div>
        <div className="form-group ">
          <label htmlFor="firstName">First Name :</label>
          <input
            id="firstName"
            type="text"
            value={firstNameInputRef}
            ref={firstNameInputRef}
            className="form-control"
          />
        </div>
        <div className="form-group ">
          <label htmlFor="lastName">Last Name :</label>
          <input
            id="lastName"
            type="text"
            value={lastNameInputRef}
            ref={lastNameInputRef}
            className="form-control"
          />
        </div>
        <div className="form-group ">
          <label htmlFor="email">Email :</label>
          <input
            id="email"
            type="email"
            value={emailInputRef}
            ref={emailInputRef}
            className="form-control"
          />
        </div>
        <div className="form-group ">
          <label htmlFor="phone">Phone No :</label>
          <input
            id="phone"
            type="number"
            value={phoneNoInputRef}
            ref={phoneNoInputRef}
            className="form-control"
          />
        </div>
        <div className="form-group ">
          <label htmlFor="password">Password :</label>
          <input
            id="password"
            type="password"
            value={passwordInputRef}
            ref={passwordInputRef}
            className="form-control"
          />
        </div>

        <button className="btn btn-primary" onClick={updateHandler}>
          Update Now
        </button>
      </form>
    </div>
  );
};

export default UpdateProfile;
