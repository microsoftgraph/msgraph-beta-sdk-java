package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsRegressionSummary extends Entity implements Parsable {
    /** The metric values for the user experience analytics Manufacturer regression. */
    private java.util.List<UserExperienceAnalyticsMetric> _manufacturerRegression;
    /** The metric values for the user experience analytics model regression. */
    private java.util.List<UserExperienceAnalyticsMetric> _modelRegression;
    /** The metric values for the user experience analytics operating system regression. */
    private java.util.List<UserExperienceAnalyticsMetric> _operatingSystemRegression;
    /**
     * Instantiates a new UserExperienceAnalyticsRegressionSummary and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsRegressionSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsRegressionSummary
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsRegressionSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsRegressionSummary();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsRegressionSummary currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("manufacturerRegression", (n) -> { currentObject.setManufacturerRegression(n.getCollectionOfObjectValues(UserExperienceAnalyticsMetric::createFromDiscriminatorValue)); });
            this.put("modelRegression", (n) -> { currentObject.setModelRegression(n.getCollectionOfObjectValues(UserExperienceAnalyticsMetric::createFromDiscriminatorValue)); });
            this.put("operatingSystemRegression", (n) -> { currentObject.setOperatingSystemRegression(n.getCollectionOfObjectValues(UserExperienceAnalyticsMetric::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the manufacturerRegression property value. The metric values for the user experience analytics Manufacturer regression.
     * @return a userExperienceAnalyticsMetric
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsMetric> getManufacturerRegression() {
        return this._manufacturerRegression;
    }
    /**
     * Gets the modelRegression property value. The metric values for the user experience analytics model regression.
     * @return a userExperienceAnalyticsMetric
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsMetric> getModelRegression() {
        return this._modelRegression;
    }
    /**
     * Gets the operatingSystemRegression property value. The metric values for the user experience analytics operating system regression.
     * @return a userExperienceAnalyticsMetric
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsMetric> getOperatingSystemRegression() {
        return this._operatingSystemRegression;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("manufacturerRegression", this.getManufacturerRegression());
        writer.writeCollectionOfObjectValues("modelRegression", this.getModelRegression());
        writer.writeCollectionOfObjectValues("operatingSystemRegression", this.getOperatingSystemRegression());
    }
    /**
     * Sets the manufacturerRegression property value. The metric values for the user experience analytics Manufacturer regression.
     * @param value Value to set for the manufacturerRegression property.
     * @return a void
     */
    public void setManufacturerRegression(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsMetric> value) {
        this._manufacturerRegression = value;
    }
    /**
     * Sets the modelRegression property value. The metric values for the user experience analytics model regression.
     * @param value Value to set for the modelRegression property.
     * @return a void
     */
    public void setModelRegression(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsMetric> value) {
        this._modelRegression = value;
    }
    /**
     * Sets the operatingSystemRegression property value. The metric values for the user experience analytics operating system regression.
     * @param value Value to set for the operatingSystemRegression property.
     * @return a void
     */
    public void setOperatingSystemRegression(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsMetric> value) {
        this._operatingSystemRegression = value;
    }
}
