import React, { useEffect, useState } from 'react';

function App() {
  const [message, setMessage] = useState('');

  useEffect(() => {
    // Spring Boot API 호출
    fetch('http://localhost:8080/api/hello') // Spring Boot API 주소
      .then(response => response.text())  // 응답을 텍스트로 처리
      .then(data => setMessage(data))  // 응답 데이터로 상태 업데이트
      .catch(error => console.error('Error fetching API:', error));
  }, []);

  return (
    <div>
      <h1>React와 Spring Boot 연동</h1>
      <p>{message}</p> {/* 텍스트 응답을 화면에 표시 */}
    </div>
  );
}

export default App;
