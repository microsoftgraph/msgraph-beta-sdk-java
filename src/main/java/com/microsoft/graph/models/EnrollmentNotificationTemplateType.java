package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum EnrollmentNotificationTemplateType implements ValuedEnum {
    /** Email Notification */
    Email("email"),
    /** Push Notification */
    Push("push"),
    /** Unknown Type */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EnrollmentNotificationTemplateType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EnrollmentNotificationTemplateType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "email": return Email;
            case "push": return Push;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
