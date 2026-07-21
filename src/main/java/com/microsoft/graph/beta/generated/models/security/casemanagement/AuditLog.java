package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuditLog extends Activity implements Parsable {
    /**
     * Instantiates a new {@link AuditLog} and sets the default values.
     */
    public AuditLog() {
        super();
        this.setOdataType("#microsoft.graph.security.caseManagement.auditLog");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AuditLog}
     */
    @jakarta.annotation.Nonnull
    public static AuditLog createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuditLog();
    }
    /**
     * Gets the action property value. The action property
     * @return a {@link AuditAction}
     */
    @jakarta.annotation.Nullable
    public AuditAction getAction() {
        return this.backingStore.get("action");
    }
    /**
     * Gets the details property value. The target resource details for the audit activity.
     * @return a {@link ActivityResourceDetails}
     */
    @jakarta.annotation.Nullable
    public ActivityResourceDetails getDetails() {
        return this.backingStore.get("details");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(AuditAction::forValue)); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getObjectValue(ActivityResourceDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("modifiedProperties", (n) -> { this.setModifiedProperties(n.getCollectionOfObjectValues(ModifiedProperty::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the modifiedProperties property value. The collection of property changes recorded in the audit log.
     * @return a {@link java.util.List<ModifiedProperty>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ModifiedProperty> getModifiedProperties() {
        return this.backingStore.get("modifiedProperties");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeObjectValue("details", this.getDetails());
        writer.writeCollectionOfObjectValues("modifiedProperties", this.getModifiedProperties());
    }
    /**
     * Sets the action property value. The action property
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final AuditAction value) {
        this.backingStore.set("action", value);
    }
    /**
     * Sets the details property value. The target resource details for the audit activity.
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final ActivityResourceDetails value) {
        this.backingStore.set("details", value);
    }
    /**
     * Sets the modifiedProperties property value. The collection of property changes recorded in the audit log.
     * @param value Value to set for the modifiedProperties property.
     */
    public void setModifiedProperties(@jakarta.annotation.Nullable final java.util.List<ModifiedProperty> value) {
        this.backingStore.set("modifiedProperties", value);
    }
}
