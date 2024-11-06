package gr.alexc.otaobservatory.dto.stats.owners;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OwnersByPrefecturePerMonth {
    private LocalDate monthDate;
    private List<OwnersByPrefecture> ownersByPrefecture;
}
