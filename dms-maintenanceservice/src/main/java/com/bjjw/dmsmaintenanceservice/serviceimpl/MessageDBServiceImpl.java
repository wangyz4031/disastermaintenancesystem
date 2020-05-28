package com.bjjw.dmsmaintenanceservice.serviceimpl;

import com.bjjw.dmsmaintenanceservice.entity.MessageEntity;
import com.bjjw.dmsmaintenanceservice.repository.MessageRepository;
import org.springframework.stereotype.Service;

@Service
public class MessageDBServiceImpl extends DBBaseServiceImpl<MessageRepository, MessageEntity> {
}
