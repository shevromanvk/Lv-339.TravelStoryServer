package com.travelstory.dto.statistic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TotalStatisticCard {
    private String title;
    private Long current;
    private Integer max;
    private String background;
    private String color;
    private String boxcolor;

    @Override
    public String toString() {
        return "{" + "title='" + title + '\'' + ", current=" + current + ", max=" + max + ", background='" + background
                + '\'' + ", color='" + color + '\'' + ", boxcolor='" + boxcolor + '\'' + '}';
    }

}
