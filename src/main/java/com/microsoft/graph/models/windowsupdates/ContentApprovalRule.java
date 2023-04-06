package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ContentApprovalRule extends ComplianceChangeRule implements Parsable {
    /** A filter to determine which content matches the rule on an ongoing basis. */
    private ContentFilter contentFilter;
    /** The time before the deployment starts represented in ISO 8601 format for durations. */
    private Period durationBeforeDeploymentStart;
    /**
     * Instantiates a new ContentApprovalRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ContentApprovalRule() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.contentApprovalRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ContentApprovalRule
     */
    @javax.annotation.Nonnull
    public static ContentApprovalRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContentApprovalRule();
    }
    /**
     * Gets the contentFilter property value. A filter to determine which content matches the rule on an ongoing basis.
     * @return a contentFilter
     */
    @javax.annotation.Nullable
    public ContentFilter getContentFilter() {
        return this.contentFilter;
    }
    /**
     * Gets the durationBeforeDeploymentStart property value. The time before the deployment starts represented in ISO 8601 format for durations.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getDurationBeforeDeploymentStart() {
        return this.durationBeforeDeploymentStart;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contentFilter", (n) -> { this.setContentFilter(n.getObjectValue(ContentFilter::createFromDiscriminatorValue)); });
        deserializerMap.put("durationBeforeDeploymentStart", (n) -> { this.setDurationBeforeDeploymentStart(n.getPeriodValue()); });
        return deserializerMap;
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
        writer.writeObjectValue("contentFilter", this.getContentFilter());
        writer.writePeriodValue("durationBeforeDeploymentStart", this.getDurationBeforeDeploymentStart());
    }
    /**
     * Sets the contentFilter property value. A filter to determine which content matches the rule on an ongoing basis.
     * @param value Value to set for the contentFilter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentFilter(@javax.annotation.Nullable final ContentFilter value) {
        this.contentFilter = value;
    }
    /**
     * Sets the durationBeforeDeploymentStart property value. The time before the deployment starts represented in ISO 8601 format for durations.
     * @param value Value to set for the durationBeforeDeploymentStart property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDurationBeforeDeploymentStart(@javax.annotation.Nullable final Period value) {
        this.durationBeforeDeploymentStart = value;
    }
}
