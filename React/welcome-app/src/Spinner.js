import React, { useState } from 'react';
import loadingGif from './loading.gif';

export default function App() {
  const [show_Hide, setShowHide] = useState('none');
  const [text, setText] = useState('Hide gif');

  const showGif = () => {
    if (show_Hide === 'flex') {
      setShowHide('none');
      setText('Show Gif')
    } else {
      setShowHide('flex');
      setText('Hide Gif')
    }
  }
  return (
    <>
        <img  src={loadingGif} alt="loading..." style={{ display: show_Hide }}/>
        <input type="checkbox" id="gif" name="gif" value="gif" onClick={showGif} />Show
    </>
  );
}