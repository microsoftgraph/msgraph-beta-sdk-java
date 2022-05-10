package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GovernanceInsight extends Entity implements Parsable {
    /** Indicates when the insight was created. */
    private OffsetDateTime _insightCreatedDateTime;
    /**
     * Instantiates a new governanceInsight and sets the default values.
     * @return a void
     */
    public GovernanceInsight() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a governanceInsight
     */
    @javax.annotation.Nonnull
    public static GovernanceInsight createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernanceInsight();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GovernanceInsight currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("insightCreatedDateTime", (n) -> { currentObject.setInsightCreatedDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the insightCreatedDateTime property value. Indicates when the insight was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getInsightCreatedDateTime() {
        return this._insightCreatedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("insightCreatedDateTime", this.getInsightCreatedDateTime());
    }
    /**
     * Sets the insightCreatedDateTime property value. Indicates when the insight was created.
     * @param value Value to set for the insightCreatedDateTime property.
     * @return a void
     */
    public void setInsightCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._insightCreatedDateTime = value;
    }
}
