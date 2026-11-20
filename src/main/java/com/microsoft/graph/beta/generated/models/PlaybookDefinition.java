package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A predefined playbook available to the caller. id is a service-generated, persisted GUID string; uniqueName preserves its backend catalog name. Sessions reference this first-class catalog entity through playbookDefinition@odata.bind.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlaybookDefinition extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PlaybookDefinition} and sets the default values.
     */
    public PlaybookDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlaybookDefinition}
     */
    @jakarta.annotation.Nonnull
    public static PlaybookDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlaybookDefinition();
    }
    /**
     * Gets the acceptedInputTypes property value. The input kinds accepted by this playbook. The possible values are: defenderIncidentId, defenderAlertId, defenderThreatIntelligenceId, azureSubscriptionId, azureIdentityId, keyword, unknownFutureValue. unknownFutureValue isn&apos;t a valid value when creating a session. Read-only.
     * @return a {@link java.util.List<InvestigationInputType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<InvestigationInputType> getAcceptedInputTypes() {
        return this.backingStore.get("acceptedInputTypes");
    }
    /**
     * Gets the description property value. The description of the work performed by the playbook. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The human-readable name of the playbook. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("acceptedInputTypes", (n) -> { this.setAcceptedInputTypes(n.getCollectionOfEnumValues(InvestigationInputType::forValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("uniqueName", (n) -> { this.setUniqueName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the uniqueName property value. The immutable, unique catalog name, such as investigate-incident. Distinct from id. Alternate-key addressing isn&apos;t supported. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUniqueName() {
        return this.backingStore.get("uniqueName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("uniqueName", this.getUniqueName());
    }
    /**
     * Sets the acceptedInputTypes property value. The input kinds accepted by this playbook. The possible values are: defenderIncidentId, defenderAlertId, defenderThreatIntelligenceId, azureSubscriptionId, azureIdentityId, keyword, unknownFutureValue. unknownFutureValue isn&apos;t a valid value when creating a session. Read-only.
     * @param value Value to set for the acceptedInputTypes property.
     */
    public void setAcceptedInputTypes(@jakarta.annotation.Nullable final java.util.List<InvestigationInputType> value) {
        this.backingStore.set("acceptedInputTypes", value);
    }
    /**
     * Sets the description property value. The description of the work performed by the playbook. Read-only.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The human-readable name of the playbook. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the uniqueName property value. The immutable, unique catalog name, such as investigate-incident. Distinct from id. Alternate-key addressing isn&apos;t supported. Read-only.
     * @param value Value to set for the uniqueName property.
     */
    public void setUniqueName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("uniqueName", value);
    }
}
