package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcPolicyScheduledApplyActionDetail extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcPolicyScheduledApplyActionDetail} and sets the default values.
     */
    public CloudPcPolicyScheduledApplyActionDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcPolicyScheduledApplyActionDetail}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcPolicyScheduledApplyActionDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcPolicyScheduledApplyActionDetail();
    }
    /**
     * Gets the cronScheduleExpression property value. An expression that specifies the cron schedule. (For example, &apos;0 0 0 20  &apos; means schedules a job to run at midnight on the 20th of every month) Administrators can set a cron expression to define the scheduling rules for automatic regular application. When auto provision is disabled, cronScheduleExpression is set to null, stopping the automatic task scheduling. Read-Only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCronScheduleExpression() {
        return this.backingStore.get("cronScheduleExpression");
    }
    /**
     * Gets the endDateTime property value. Indicates IT Admins can set an end date to define the last scheduler run before this time. If not set, the scheduler runs continuously. There is no time zone information at this time; it needs to be coordinated with timezone, for example, &apos;2025-02-01 00:00:00&apos; with &apos;China Standard Time&apos; means the scheduling rule takes effect before Feb 01 2025 00:00:00 GMT+0800 (China Standard Time).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEndDateTime() {
        return this.backingStore.get("endDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cronScheduleExpression", (n) -> { this.setCronScheduleExpression(n.getStringValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getStringValue()); });
        deserializerMap.put("nextRunDateTime", (n) -> { this.setNextRunDateTime(n.getStringValue()); });
        deserializerMap.put("reservePercentage", (n) -> { this.setReservePercentage(n.getIntegerValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getStringValue()); });
        deserializerMap.put("timezone", (n) -> { this.setTimezone(n.getEnumValue(CloudPcPolicyTimezone::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the nextRunDateTime property value. Indicates IT Admins can see when the next automatic regular apply is executed. It needs to be coordinated with timezone, for example, &apos;2025-01-01 00:00:00&apos; with &apos;China Standard Time&apos; means the next task executes at Jan 01 2025 00:00:00 GMT+0800 (China Standard Time). Read-Only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNextRunDateTime() {
        return this.backingStore.get("nextRunDateTime");
    }
    /**
     * Gets the reservePercentage property value. The percentage of Cloud PCs to keep available. Administrators can set this property to a value from 0 to 99. Cloud PCs are reprovisioned only when there are no active and connected Cloud PC users. Frontline shared only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getReservePercentage() {
        return this.backingStore.get("reservePercentage");
    }
    /**
     * Gets the startDateTime property value. Indicates IT Admins can set a start date to define the first scheduler run after this time. If not set, the default is the current time. There is no time zone information at this time, it needs to be coordinated with timezone, for example, &apos;2025-01-01 00:00:00&apos; with &apos;China Standard Time&apos; means the scheduling rule takes effect after Jan 01 2025 00:00:00 GMT+0800 (China Standard Time).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the timezone property value. The timezone property
     * @return a {@link CloudPcPolicyTimezone}
     */
    @jakarta.annotation.Nullable
    public CloudPcPolicyTimezone getTimezone() {
        return this.backingStore.get("timezone");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("cronScheduleExpression", this.getCronScheduleExpression());
        writer.writeStringValue("endDateTime", this.getEndDateTime());
        writer.writeStringValue("nextRunDateTime", this.getNextRunDateTime());
        writer.writeIntegerValue("reservePercentage", this.getReservePercentage());
        writer.writeStringValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("timezone", this.getTimezone());
    }
    /**
     * Sets the cronScheduleExpression property value. An expression that specifies the cron schedule. (For example, &apos;0 0 0 20  &apos; means schedules a job to run at midnight on the 20th of every month) Administrators can set a cron expression to define the scheduling rules for automatic regular application. When auto provision is disabled, cronScheduleExpression is set to null, stopping the automatic task scheduling. Read-Only.
     * @param value Value to set for the cronScheduleExpression property.
     */
    public void setCronScheduleExpression(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("cronScheduleExpression", value);
    }
    /**
     * Sets the endDateTime property value. Indicates IT Admins can set an end date to define the last scheduler run before this time. If not set, the scheduler runs continuously. There is no time zone information at this time; it needs to be coordinated with timezone, for example, &apos;2025-02-01 00:00:00&apos; with &apos;China Standard Time&apos; means the scheduling rule takes effect before Feb 01 2025 00:00:00 GMT+0800 (China Standard Time).
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the nextRunDateTime property value. Indicates IT Admins can see when the next automatic regular apply is executed. It needs to be coordinated with timezone, for example, &apos;2025-01-01 00:00:00&apos; with &apos;China Standard Time&apos; means the next task executes at Jan 01 2025 00:00:00 GMT+0800 (China Standard Time). Read-Only.
     * @param value Value to set for the nextRunDateTime property.
     */
    public void setNextRunDateTime(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("nextRunDateTime", value);
    }
    /**
     * Sets the reservePercentage property value. The percentage of Cloud PCs to keep available. Administrators can set this property to a value from 0 to 99. Cloud PCs are reprovisioned only when there are no active and connected Cloud PC users. Frontline shared only.
     * @param value Value to set for the reservePercentage property.
     */
    public void setReservePercentage(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("reservePercentage", value);
    }
    /**
     * Sets the startDateTime property value. Indicates IT Admins can set a start date to define the first scheduler run after this time. If not set, the default is the current time. There is no time zone information at this time, it needs to be coordinated with timezone, for example, &apos;2025-01-01 00:00:00&apos; with &apos;China Standard Time&apos; means the scheduling rule takes effect after Jan 01 2025 00:00:00 GMT+0800 (China Standard Time).
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the timezone property value. The timezone property
     * @param value Value to set for the timezone property.
     */
    public void setTimezone(@jakarta.annotation.Nullable final CloudPcPolicyTimezone value) {
        this.backingStore.set("timezone", value);
    }
}
