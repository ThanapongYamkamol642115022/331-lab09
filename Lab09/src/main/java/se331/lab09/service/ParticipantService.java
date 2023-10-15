package se331.lab09.service;

import org.springframework.data.domain.Page;
import se331.lab08_1.entity.Participant;

import java.util.List;

public interface ParticipantService {
    List<Participant> getAllParticipants();
    Page<Participant> getParticipant(Integer page,Integer pageSize);
}
