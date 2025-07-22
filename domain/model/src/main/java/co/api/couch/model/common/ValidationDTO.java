package co.api.couch.model.common;

public record ValidationDTO(
        String field,
        String error
) {
}
