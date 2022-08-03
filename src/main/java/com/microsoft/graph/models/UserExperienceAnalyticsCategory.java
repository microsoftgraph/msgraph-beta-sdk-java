package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsCategory extends Entity implements Parsable {
    /** The insights for the user experience analytics category. */
    private java.util.List<UserExperienceAnalyticsInsight> _insights;
    /** The metric values for the user experience analytics category. */
    private java.util.List<UserExperienceAnalyticsMetric> _metricValues;
    /**
     * Instantiates a new userExperienceAnalyticsCategory and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsCategory() {
        super();
        this.setOdataType("#microsoft.graph.userExperienceAnalyticsCategory");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsCategory
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsCategory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsCategory();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsCategory currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("insights", (n) -> { currentObject.setInsights(n.getCollectionOfObjectValues(UserExperienceAnalyticsInsight::createFromDiscriminatorValue)); });
            this.put("metricValues", (n) -> { currentObject.setMetricValues(n.getCollectionOfObjectValues(UserExperienceAnalyticsMetric::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the insights property value. The insights for the user experience analytics category.
     * @return a userExperienceAnalyticsInsight
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsInsight> getInsights() {
        return this._insights;
    }
    /**
     * Gets the metricValues property value. The metric values for the user experience analytics category.
     * @return a userExperienceAnalyticsMetric
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsMetric> getMetricValues() {
        return this._metricValues;
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
        writer.writeCollectionOfObjectValues("metricValues", this.getMetricValues());
    }
    /**
     * Sets the insights property value. The insights for the user experience analytics category.
     * @param value Value to set for the insights property.
     * @return a void
     */
    public void setInsights(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsInsight> value) {
        this._insights = value;
    }
    /**
     * Sets the metricValues property value. The metric values for the user experience analytics category.
     * @param value Value to set for the metricValues property.
     * @return a void
     */
    public void setMetricValues(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsMetric> value) {
        this._metricValues = value;
    }
}
