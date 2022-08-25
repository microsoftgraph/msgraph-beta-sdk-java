package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum OpenIdConnectResponseTypes implements ValuedEnum {
    Code("code"),
    Id_token("id_token"),
    Token("token");
    public final String value;
    OpenIdConnectResponseTypes(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OpenIdConnectResponseTypes forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "code": return Code;
            case "id_token": return Id_token;
            case "token": return Token;
            default: return null;
        }
    }
}
