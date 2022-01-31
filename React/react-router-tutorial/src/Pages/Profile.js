import React, { useEffect } from 'react';
import { useHistory } from 'react-router-dom/cjs/react-router-dom.min';

const Profile = ({ login }) => {

  const history = useHistory();
  if (!login) {
    history.push('/');
  }

  // useEffect(() => {
  //   if (!login) {
  //     history.push('/');
  //   }
  // }, [login,history])

  return <h1>Profile Page</h1>;
};

export default Profile;
