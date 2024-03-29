package com.team13.n1.service;

import com.team13.n1.entity.UserSession;
import com.team13.n1.repository.UserSessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserSessionService {
    private final UserSessionRepository repository;

    // 해당 세션 ID가 존재하는지 확인
    public boolean existsById(String sessionId) {
        // 테스트용 코드
        if (sessionId.equals("test_session_id"))
            return true;

        return repository.existsById(sessionId);
    }

    // 해당 세션의 유저 ID값을 반환
    public String getUserIdBySessionId(String sessionId) {
        Optional<UserSession> userSession = repository.findById(sessionId);
        if (userSession.isPresent()) {
            return userSession.get().getUserId();
        }

        // 테스트용 코드
        if (sessionId.equals("test_session_id"))
            return "ypjun100";

        return "";
    }

    // 새로운 세션 저장
    public void save(UserSession userSession) {
        repository.save(userSession);
    }
}
