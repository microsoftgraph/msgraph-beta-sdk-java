package com.microsoft.graph.models.devicemanagement;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Monitoring extends Entity implements Parsable {
    /**
     * Instantiates a new Monitoring and sets the default values.
     */
    public Monitoring() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Monitoring
     */
    @jakarta.annotation.Nonnull
    public static Monitoring createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Monitoring();
    }
    /**
     * Gets the alertRecords property value. The collection of records of alert events.
     * @return a java.util.List<AlertRecord>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AlertRecord> getAlertRecords() {
        return this.backingStore.get("alertRecords");
    }
    /**
     * Gets the alertRules property value. The collection of alert rules.
     * @return a java.util.List<AlertRule>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AlertRule> getAlertRules() {
        return this.backingStore.get("alertRules");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alertRecords", (n) -> { this.setAlertRecords(n.getCollectionOfObjectValues(AlertRecord::createFromDiscriminatorValue)); });
        deserializerMap.put("alertRules", (n) -> { this.setAlertRules(n.getCollectionOfObjectValues(AlertRule::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("alertRecords", this.getAlertRecords());
        writer.writeCollectionOfObjectValues("alertRules", this.getAlertRules());
    }
    /**
     * Sets the alertRecords property value. The collection of records of alert events.
     * @param value Value to set for the alertRecords property.
     */
    public void setAlertRecords(@jakarta.annotation.Nullable final java.util.List<AlertRecord> value) {
        this.backingStore.set("alertRecords", value);
    }
    /**
     * Sets the alertRules property value. The collection of alert rules.
     * @param value Value to set for the alertRules property.
     */
    public void setAlertRules(@jakarta.annotation.Nullable final java.util.List<AlertRule> value) {
        this.backingStore.set("alertRules", value);
    }
}
