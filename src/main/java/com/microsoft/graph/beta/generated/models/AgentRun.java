package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * An agent&apos;s contribution to a session. Read this resource to observe the agent&apos;s processing status.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgentRun extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AgentRun} and sets the default values.
     */
    public AgentRun() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgentRun}
     */
    @jakarta.annotation.Nonnull
    public static AgentRun createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgentRun();
    }
    /**
     * Gets the agent property value. Embedded description of the agent that performed a run, without an independently addressable catalog.
     * @return a {@link AgentInfo}
     */
    @jakarta.annotation.Nullable
    public AgentInfo getAgent() {
        return this.backingStore.get("agent");
    }
    /**
     * Gets the completedDateTime property value. The UTC date and time when the run completed successfully, in ISO 8601 format. Absent otherwise. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.backingStore.get("completedDateTime");
    }
    /**
     * Gets the createdDateTime property value. The UTC date and time when the resource was created, in ISO 8601 format. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the durationInMilliseconds property value. The elapsed time from creation to successful completion, in milliseconds. Absent otherwise. Read-only.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getDurationInMilliseconds() {
        return this.backingStore.get("durationInMilliseconds");
    }
    /**
     * Gets the failureInfo property value. The run-level failure details, when available. Read-only.
     * @return a {@link AgentRunFailureInfo}
     */
    @jakarta.annotation.Nullable
    public AgentRunFailureInfo getFailureInfo() {
        return this.backingStore.get("failureInfo");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agent", (n) -> { this.setAgent(n.getObjectValue(AgentInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("durationInMilliseconds", (n) -> { this.setDurationInMilliseconds(n.getLongValue()); });
        deserializerMap.put("failureInfo", (n) -> { this.setFailureInfo(n.getObjectValue(AgentRunFailureInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("initiatedBy", (n) -> { this.setInitiatedBy(n.getObjectValue(InvestigationIdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("messages", (n) -> { this.setMessages(n.getCollectionOfObjectValues(InvestigationMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("startedDateTime", (n) -> { this.setStartedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(LongRunningOperationStatus::forValue)); });
        deserializerMap.put("statusDetail", (n) -> { this.setStatusDetail(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the initiatedBy property value. The initiating principals recorded by the service, when available. Read-only. This property doesn&apos;t select an execution identity.
     * @return a {@link InvestigationIdentitySet}
     */
    @jakarta.annotation.Nullable
    public InvestigationIdentitySet getInitiatedBy() {
        return this.backingStore.get("initiatedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The UTC date and time when the resource was last updated, in ISO 8601 format. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the messages property value. Read-only investigation messages contained by this run; id maps backend messageId. Supports collection and keyed reads. Message creation is not supported. Collection overflow requires an @odata.nextLink preserving tenant, caller, parent and query context; this schema requirement does not attest runtime implementation.
     * @return a {@link java.util.List<InvestigationMessage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<InvestigationMessage> getMessages() {
        return this.backingStore.get("messages");
    }
    /**
     * Gets the startedDateTime property value. The UTC start timestamp, in ISO 8601 format. Currently reflects creation time, not a distinct execution-start measurement. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartedDateTime() {
        return this.backingStore.get("startedDateTime");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link LongRunningOperationStatus}
     */
    @jakarta.annotation.Nullable
    public LongRunningOperationStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the statusDetail property value. Additional processing detail, including pendingInput or canceled, when the status alone doesn&apos;t describe the source lifecycle. Read-only. Doesn&apos;t support $filter.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatusDetail() {
        return this.backingStore.get("statusDetail");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("agent", this.getAgent());
        writer.writeCollectionOfObjectValues("messages", this.getMessages());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the agent property value. Embedded description of the agent that performed a run, without an independently addressable catalog.
     * @param value Value to set for the agent property.
     */
    public void setAgent(@jakarta.annotation.Nullable final AgentInfo value) {
        this.backingStore.set("agent", value);
    }
    /**
     * Sets the completedDateTime property value. The UTC date and time when the run completed successfully, in ISO 8601 format. Absent otherwise. Read-only.
     * @param value Value to set for the completedDateTime property.
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("completedDateTime", value);
    }
    /**
     * Sets the createdDateTime property value. The UTC date and time when the resource was created, in ISO 8601 format. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the durationInMilliseconds property value. The elapsed time from creation to successful completion, in milliseconds. Absent otherwise. Read-only.
     * @param value Value to set for the durationInMilliseconds property.
     */
    public void setDurationInMilliseconds(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("durationInMilliseconds", value);
    }
    /**
     * Sets the failureInfo property value. The run-level failure details, when available. Read-only.
     * @param value Value to set for the failureInfo property.
     */
    public void setFailureInfo(@jakarta.annotation.Nullable final AgentRunFailureInfo value) {
        this.backingStore.set("failureInfo", value);
    }
    /**
     * Sets the initiatedBy property value. The initiating principals recorded by the service, when available. Read-only. This property doesn&apos;t select an execution identity.
     * @param value Value to set for the initiatedBy property.
     */
    public void setInitiatedBy(@jakarta.annotation.Nullable final InvestigationIdentitySet value) {
        this.backingStore.set("initiatedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The UTC date and time when the resource was last updated, in ISO 8601 format. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the messages property value. Read-only investigation messages contained by this run; id maps backend messageId. Supports collection and keyed reads. Message creation is not supported. Collection overflow requires an @odata.nextLink preserving tenant, caller, parent and query context; this schema requirement does not attest runtime implementation.
     * @param value Value to set for the messages property.
     */
    public void setMessages(@jakarta.annotation.Nullable final java.util.List<InvestigationMessage> value) {
        this.backingStore.set("messages", value);
    }
    /**
     * Sets the startedDateTime property value. The UTC start timestamp, in ISO 8601 format. Currently reflects creation time, not a distinct execution-start measurement. Read-only.
     * @param value Value to set for the startedDateTime property.
     */
    public void setStartedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startedDateTime", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final LongRunningOperationStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the statusDetail property value. Additional processing detail, including pendingInput or canceled, when the status alone doesn&apos;t describe the source lifecycle. Read-only. Doesn&apos;t support $filter.
     * @param value Value to set for the statusDetail property.
     */
    public void setStatusDetail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("statusDetail", value);
    }
}
