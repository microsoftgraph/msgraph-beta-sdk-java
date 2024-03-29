package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContentApprovalRule extends ComplianceChangeRule implements Parsable {
    /**
     * Instantiates a new {@link ContentApprovalRule} and sets the default values.
     */
    public ContentApprovalRule() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.contentApprovalRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ContentApprovalRule}
     */
    @jakarta.annotation.Nonnull
    public static ContentApprovalRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContentApprovalRule();
    }
    /**
     * Gets the contentFilter property value. A filter to determine which content matches the rule on an ongoing basis.
     * @return a {@link ContentFilter}
     */
    @jakarta.annotation.Nullable
    public ContentFilter getContentFilter() {
        return this.backingStore.get("contentFilter");
    }
    /**
     * Gets the durationBeforeDeploymentStart property value. The time before the deployment starts represented in ISO 8601 format for durations.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getDurationBeforeDeploymentStart() {
        return this.backingStore.get("durationBeforeDeploymentStart");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contentFilter", (n) -> { this.setContentFilter(n.getObjectValue(ContentFilter::createFromDiscriminatorValue)); });
        deserializerMap.put("durationBeforeDeploymentStart", (n) -> { this.setDurationBeforeDeploymentStart(n.getPeriodAndDurationValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("contentFilter", this.getContentFilter());
        writer.writePeriodAndDurationValue("durationBeforeDeploymentStart", this.getDurationBeforeDeploymentStart());
    }
    /**
     * Sets the contentFilter property value. A filter to determine which content matches the rule on an ongoing basis.
     * @param value Value to set for the contentFilter property.
     */
    public void setContentFilter(@jakarta.annotation.Nullable final ContentFilter value) {
        this.backingStore.set("contentFilter", value);
    }
    /**
     * Sets the durationBeforeDeploymentStart property value. The time before the deployment starts represented in ISO 8601 format for durations.
     * @param value Value to set for the durationBeforeDeploymentStart property.
     */
    public void setDurationBeforeDeploymentStart(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("durationBeforeDeploymentStart", value);
    }
}
