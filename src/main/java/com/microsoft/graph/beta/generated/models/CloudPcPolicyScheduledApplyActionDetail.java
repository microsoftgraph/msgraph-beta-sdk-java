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
     * Gets the cronScheduleExpression property value. An expression that specifies the cron schedule. (For example, &apos;0 0 0 20  &apos; means schedules a job to run at midnight on the 20th of every month) Administrators can set a cron expression to define the scheduling rules for automatic regular application. When auto-provision is disabled, cronScheduleExpression is set to null, stopping the automatic task scheduling. Read-Only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCronScheduleExpression() {
        return this.backingStore.get("cronScheduleExpression");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cronScheduleExpression", (n) -> { this.setCronScheduleExpression(n.getStringValue()); });
        deserializerMap.put("reservePercentage", (n) -> { this.setReservePercentage(n.getIntegerValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("cronScheduleExpression", this.getCronScheduleExpression());
        writer.writeIntegerValue("reservePercentage", this.getReservePercentage());
    }
    /**
     * Sets the cronScheduleExpression property value. An expression that specifies the cron schedule. (For example, &apos;0 0 0 20  &apos; means schedules a job to run at midnight on the 20th of every month) Administrators can set a cron expression to define the scheduling rules for automatic regular application. When auto-provision is disabled, cronScheduleExpression is set to null, stopping the automatic task scheduling. Read-Only.
     * @param value Value to set for the cronScheduleExpression property.
     */
    public void setCronScheduleExpression(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("cronScheduleExpression", value);
    }
    /**
     * Sets the reservePercentage property value. The percentage of Cloud PCs to keep available. Administrators can set this property to a value from 0 to 99. Cloud PCs are reprovisioned only when there are no active and connected Cloud PC users. Frontline shared only.
     * @param value Value to set for the reservePercentage property.
     */
    public void setReservePercentage(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("reservePercentage", value);
    }
}
