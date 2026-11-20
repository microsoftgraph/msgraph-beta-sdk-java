package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Container for agentic security playbook definitions and sessions.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgenticSecurityRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AgenticSecurityRoot} and sets the default values.
     */
    public AgenticSecurityRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgenticSecurityRoot}
     */
    @jakarta.annotation.Nonnull
    public static AgenticSecurityRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgenticSecurityRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("playbookDefinitions", (n) -> { this.setPlaybookDefinitions(n.getCollectionOfObjectValues(PlaybookDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("sessions", (n) -> { this.setSessions(n.getCollectionOfObjectValues(InvestigationSession::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the playbookDefinitions property value. The read-only playbook catalog. Supports list and keyed GET with $select. Doesn&apos;t support $filter, $orderby, $search, $expand, $count, $top, $skip, or delta tracking.
     * @return a {@link java.util.List<PlaybookDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlaybookDefinition> getPlaybookDefinitions() {
        return this.backingStore.get("playbookDefinitions");
    }
    /**
     * Gets the sessions property value. The agentic sessions visible to the caller. Supports list with $filter on status (eq, or, in), $top, and $select; session creation; and keyed reads. Doesn&apos;t support $count, $orderby, $search, $expand, $skip, or delta tracking.
     * @return a {@link java.util.List<InvestigationSession>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<InvestigationSession> getSessions() {
        return this.backingStore.get("sessions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("playbookDefinitions", this.getPlaybookDefinitions());
        writer.writeCollectionOfObjectValues("sessions", this.getSessions());
    }
    /**
     * Sets the playbookDefinitions property value. The read-only playbook catalog. Supports list and keyed GET with $select. Doesn&apos;t support $filter, $orderby, $search, $expand, $count, $top, $skip, or delta tracking.
     * @param value Value to set for the playbookDefinitions property.
     */
    public void setPlaybookDefinitions(@jakarta.annotation.Nullable final java.util.List<PlaybookDefinition> value) {
        this.backingStore.set("playbookDefinitions", value);
    }
    /**
     * Sets the sessions property value. The agentic sessions visible to the caller. Supports list with $filter on status (eq, or, in), $top, and $select; session creation; and keyed reads. Doesn&apos;t support $count, $orderby, $search, $expand, $skip, or delta tracking.
     * @param value Value to set for the sessions property.
     */
    public void setSessions(@jakarta.annotation.Nullable final java.util.List<InvestigationSession> value) {
        this.backingStore.set("sessions", value);
    }
}
