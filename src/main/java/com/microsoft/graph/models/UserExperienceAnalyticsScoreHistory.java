package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsScoreHistory extends Entity implements Parsable {
    /** The user experience analytics device startup date time. */
    private OffsetDateTime _startupDateTime;
    /**
     * Instantiates a new userExperienceAnalyticsScoreHistory and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsScoreHistory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsScoreHistory
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsScoreHistory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsScoreHistory();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsScoreHistory currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("startupDateTime", (n) -> { currentObject.setStartupDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the startupDateTime property value. The user experience analytics device startup date time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartupDateTime() {
        return this._startupDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("startupDateTime", this.getStartupDateTime());
    }
    /**
     * Sets the startupDateTime property value. The user experience analytics device startup date time.
     * @param value Value to set for the startupDateTime property.
     * @return a void
     */
    public void setStartupDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startupDateTime = value;
    }
}
