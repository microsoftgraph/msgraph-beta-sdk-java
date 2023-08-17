package com.microsoft.graph.models.devicemanagement;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Monitoring extends Entity implements Parsable {
    /**
     * The collection of records of alert events.
     */
    private java.util.List<AlertRecord> alertRecords;
    /**
     * The collection of alert rules.
     */
    private java.util.List<AlertRule> alertRules;
    /**
     * Instantiates a new monitoring and sets the default values.
     */
    public Monitoring() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a monitoring
     */
    @jakarta.annotation.Nonnull
    public static Monitoring createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Monitoring();
    }
    /**
     * Gets the alertRecords property value. The collection of records of alert events.
     * @return a alertRecord
     */
    @jakarta.annotation.Nullable
    public java.util.List<AlertRecord> getAlertRecords() {
        return this.alertRecords;
    }
    /**
     * Gets the alertRules property value. The collection of alert rules.
     * @return a alertRule
     */
    @jakarta.annotation.Nullable
    public java.util.List<AlertRule> getAlertRules() {
        return this.alertRules;
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
        this.alertRecords = value;
    }
    /**
     * Sets the alertRules property value. The collection of alert rules.
     * @param value Value to set for the alertRules property.
     */
    public void setAlertRules(@jakarta.annotation.Nullable final java.util.List<AlertRule> value) {
        this.alertRules = value;
    }
}
