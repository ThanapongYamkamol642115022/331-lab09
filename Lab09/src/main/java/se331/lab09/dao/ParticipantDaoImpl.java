package se331.lab09.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import se331.lab08_1.entity.Participant;
import se331.lab08_1.repository.ParticipantRepository;

@Repository
@RequiredArgsConstructor
public class ParticipantDaoImpl implements ParticipantDao{
    final ParticipantRepository participantRepository;
    @Override
    public Page<Participant> getParticipant(Pageable pageRequest){
        return participantRepository.findAll(pageRequest);
    }

}
