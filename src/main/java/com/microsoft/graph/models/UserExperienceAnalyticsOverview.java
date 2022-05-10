package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsOverview extends Entity implements Parsable {
    /** The user experience analytics insights. */
    private java.util.List<UserExperienceAnalyticsInsight> _insights;
    /**
     * Instantiates a new userExperienceAnalyticsOverview and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsOverview() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsOverview
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsOverview createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsOverview();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsOverview currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("insights", (n) -> { currentObject.setInsights(n.getCollectionOfObjectValues(UserExperienceAnalyticsInsight::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the insights property value. The user experience analytics insights.
     * @return a userExperienceAnalyticsInsight
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsInsight> getInsights() {
        return this._insights;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("insights", this.getInsights());
    }
    /**
     * Sets the insights property value. The user experience analytics insights.
     * @param value Value to set for the insights property.
     * @return a void
     */
    public void setInsights(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsInsight> value) {
        this._insights = value;
    }
}
