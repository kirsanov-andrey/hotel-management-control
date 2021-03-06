package ru.hotel.management.hotel.control.domain

import lombok.Data
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.hotel.management.hotel.control.domain.enums.RoomStatus
import java.time.Instant

@Data
@Document("rooms")
class Room(
        @Id
        var id: Long,

        var name: String,

        var description: String,

        var status: RoomStatus,

        var price: Int = 0,

        var availableNumber: Int = 0,

        var bookedNumber: Int = 0,

        var createdDateTime: Instant,

        var updatedDateTime: Instant,

        var bookedDateTime: Instant?,

        var facilities: List<RoomFacility>
)
