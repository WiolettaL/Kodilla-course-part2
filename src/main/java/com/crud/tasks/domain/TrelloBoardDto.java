package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrelloBoardDto {

    public TrelloBoardDto(String id, String name, List<TrelloListDto> lists) {
        this.id = id;
        this.name = name;
        this.lists = lists;
    }

    public TrelloBoardDto() {

    }

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("lists")
    private List<TrelloListDto> lists;


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<TrelloListDto> getLists() {
        return lists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrelloBoardDto that = (TrelloBoardDto) o;

        if (!name.equals(that.name)) return false;
        if (!id.equals(that.id)) return false;
        return lists.equals(that.lists);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + id.hashCode();
        result = 31 * result + lists.hashCode();
        return result;
    }
}


