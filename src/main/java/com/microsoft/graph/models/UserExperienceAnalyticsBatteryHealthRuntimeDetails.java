package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsBatteryHealthRuntimeDetails extends Entity implements Parsable {
    /** Number of active devices within the tenant. Valid values -2147483648 to 2147483647 */
    private Integer activeDevices;
    /** Number of devices whose active runtime is greater than 3 hours but lesser than 5 hours. Valid values -2147483648 to 2147483647 */
    private Integer batteryRuntimeFair;
    /** Number of devices  whose active runtime is greater than 5 hours. Valid values -2147483648 to 2147483647 */
    private Integer batteryRuntimeGood;
    /** Number of devices whose active runtime is lesser than 3 hours. Valid values -2147483648 to 2147483647 */
    private Integer batteryRuntimePoor;
    /** Recorded date time of this runtime details instance. */
    private OffsetDateTime lastRefreshedDateTime;
    /**
     * Instantiates a new UserExperienceAnalyticsBatteryHealthRuntimeDetails and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsBatteryHealthRuntimeDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsBatteryHealthRuntimeDetails
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsBatteryHealthRuntimeDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsBatteryHealthRuntimeDetails();
    }
    /**
     * Gets the activeDevices property value. Number of active devices within the tenant. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActiveDevices() {
        return this.activeDevices;
    }
    /**
     * Gets the batteryRuntimeFair property value. Number of devices whose active runtime is greater than 3 hours but lesser than 5 hours. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBatteryRuntimeFair() {
        return this.batteryRuntimeFair;
    }
    /**
     * Gets the batteryRuntimeGood property value. Number of devices  whose active runtime is greater than 5 hours. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBatteryRuntimeGood() {
        return this.batteryRuntimeGood;
    }
    /**
     * Gets the batteryRuntimePoor property value. Number of devices whose active runtime is lesser than 3 hours. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBatteryRuntimePoor() {
        return this.batteryRuntimePoor;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeDevices", (n) -> { this.setActiveDevices(n.getIntegerValue()); });
        deserializerMap.put("batteryRuntimeFair", (n) -> { this.setBatteryRuntimeFair(n.getIntegerValue()); });
        deserializerMap.put("batteryRuntimeGood", (n) -> { this.setBatteryRuntimeGood(n.getIntegerValue()); });
        deserializerMap.put("batteryRuntimePoor", (n) -> { this.setBatteryRuntimePoor(n.getIntegerValue()); });
        deserializerMap.put("lastRefreshedDateTime", (n) -> { this.setLastRefreshedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastRefreshedDateTime property value. Recorded date time of this runtime details instance.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastRefreshedDateTime() {
        return this.lastRefreshedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("activeDevices", this.getActiveDevices());
        writer.writeIntegerValue("batteryRuntimeFair", this.getBatteryRuntimeFair());
        writer.writeIntegerValue("batteryRuntimeGood", this.getBatteryRuntimeGood());
        writer.writeIntegerValue("batteryRuntimePoor", this.getBatteryRuntimePoor());
        writer.writeOffsetDateTimeValue("lastRefreshedDateTime", this.getLastRefreshedDateTime());
    }
    /**
     * Sets the activeDevices property value. Number of active devices within the tenant. Valid values -2147483648 to 2147483647
     * @param value Value to set for the activeDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActiveDevices(@javax.annotation.Nullable final Integer value) {
        this.activeDevices = value;
    }
    /**
     * Sets the batteryRuntimeFair property value. Number of devices whose active runtime is greater than 3 hours but lesser than 5 hours. Valid values -2147483648 to 2147483647
     * @param value Value to set for the batteryRuntimeFair property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBatteryRuntimeFair(@javax.annotation.Nullable final Integer value) {
        this.batteryRuntimeFair = value;
    }
    /**
     * Sets the batteryRuntimeGood property value. Number of devices  whose active runtime is greater than 5 hours. Valid values -2147483648 to 2147483647
     * @param value Value to set for the batteryRuntimeGood property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBatteryRuntimeGood(@javax.annotation.Nullable final Integer value) {
        this.batteryRuntimeGood = value;
    }
    /**
     * Sets the batteryRuntimePoor property value. Number of devices whose active runtime is lesser than 3 hours. Valid values -2147483648 to 2147483647
     * @param value Value to set for the batteryRuntimePoor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBatteryRuntimePoor(@javax.annotation.Nullable final Integer value) {
        this.batteryRuntimePoor = value;
    }
    /**
     * Sets the lastRefreshedDateTime property value. Recorded date time of this runtime details instance.
     * @param value Value to set for the lastRefreshedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastRefreshedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastRefreshedDateTime = value;
    }
}
