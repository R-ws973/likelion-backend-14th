package com.example.api.week9.assignment.controller;

import com.example.api.week9.assignment.domain.Assignment;
import com.example.api.week9.assignment.dto.AssignmentCreateRequest;
import com.example.api.week9.assignment.dto.AssignmentResponse;
import com.example.api.week9.assignment.service.AssignmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "과제 관리", description = "과제 제출 및 조회 API")
@RestController
public class AssignmentController {
    private final AssignmentService assignmentService;
    public AssignmentController(AssignmentService assignmentService) {
        this.assignmentService = assignmentService;
    }

    @Operation(summary = "과제 생성", description = "특정 멤버의 과제를 새로 생성합니다.")
    @PostMapping("/members/{memberId}/assignments")
    public ResponseEntity<AssignmentResponse> create(@PathVariable Long memberId, @RequestBody AssignmentCreateRequest request) {
        Assignment assignment = assignmentService.create(memberId, request);
        if(assignment == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(AssignmentResponse.from(assignment));
    }

    @Operation(summary = "과제 조회", description = "id로 과제 정보를 조회합니다.")
    @GetMapping("/assignments/{id}")
    public ResponseEntity<AssignmentResponse> get(@PathVariable Long id) {
        Assignment assignment = assignmentService.findById(id);
        if(assignment == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(AssignmentResponse.from(assignment));
    }

    @Operation(summary = "과제 삭제", description = "Id를 기준으로 과제를 삭제합니다.")
    @DeleteMapping("/assignments/{id}")
    public ResponseEntity<AssignmentResponse> delete(@PathVariable Long id) {
        Assignment assignment = assignmentService.findById(id);
        if(assignment == null) {
            return ResponseEntity.noContent().build();
        }
        // 서비스에서 실제 삭제 로직을 호출하는 코드가 필요할 수 있으나, 현재 컨트롤러 구조를 유지하며 Swagger만 추가합니다.
        return  ResponseEntity.noContent().build();
    }
}
