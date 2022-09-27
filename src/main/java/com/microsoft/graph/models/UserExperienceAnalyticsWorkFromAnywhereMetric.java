package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The user experience analytics metric for work from anywhere report */
public class UserExperienceAnalyticsWorkFromAnywhereMetric extends Entity implements Parsable {
    /** The work from anywhere metric devices. */
    private java.util.List<UserExperienceAnalyticsWorkFromAnywhereDevice> _metricDevices;
    /**
     * Instantiates a new userExperienceAnalyticsWorkFromAnywhereMetric and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsWorkFromAnywhereMetric() {
        super();
        this.setOdataType("#microsoft.graph.userExperienceAnalyticsWorkFromAnywhereMetric");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsWorkFromAnywhereMetric
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsWorkFromAnywhereMetric createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsWorkFromAnywhereMetric();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsWorkFromAnywhereMetric currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("metricDevices", (n) -> { currentObject.setMetricDevices(n.getCollectionOfObjectValues(UserExperienceAnalyticsWorkFromAnywhereDevice::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the metricDevices property value. The work from anywhere metric devices.
     * @return a userExperienceAnalyticsWorkFromAnywhereDevice
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsWorkFromAnywhereDevice> getMetricDevices() {
        return this._metricDevices;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("metricDevices", this.getMetricDevices());
    }
    /**
     * Sets the metricDevices property value. The work from anywhere metric devices.
     * @param value Value to set for the metricDevices property.
     * @return a void
     */
    public void setMetricDevices(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsWorkFromAnywhereDevice> value) {
        this._metricDevices = value;
    }
}
