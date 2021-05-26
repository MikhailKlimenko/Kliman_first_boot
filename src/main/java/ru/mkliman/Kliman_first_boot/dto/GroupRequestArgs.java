package ru.mkliman.Kliman_first_boot.dto;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.nonNull;

/**
 * Request arguments for group requests.
 */
public class GroupRequestArgs {

    private final String query;
    private final GroupInfoType type;
    private final GroupFilter filter;

    /**
     * specified where to start getting groups
     */
    private final Integer offset;
    /**
     * Limited number of groups.
     */
    private final Integer limit;

    public Map populateQueries() {
        Map queries = new HashMap<>();
        if(nonNull(query)) {
            queries.put("query", query);
        }
        if(nonNull(type)) {
            queries.put("type", type);
        }
        if(nonNull(filter)) {
            queries.put("filter", filter);
        }
        if(nonNull(offset)) {
            queries.put("offset", offset);
        }
        if(nonNull(limit)) {
            queries.put("limit", limit);
        }
        return queries;
    }

    public String getQuery() {
        return query;
    }

    public GroupInfoType getType() {
        return type;
    }

    public GroupFilter getFilter() {
        return filter;
    }

    public Integer getOffset() {
        return offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public GroupRequestArgs(String query, GroupInfoType type, GroupFilter filter, Integer offset, Integer limit) {
        this.query = query;
        this.type = type;
        this.filter = filter;
        this.offset = offset;
        this.limit = limit;
    }
}