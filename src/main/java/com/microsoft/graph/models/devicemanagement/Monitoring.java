package com.microsoft.graph.models.devicemanagement;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Monitoring extends Entity implements Parsable {
    /** The alertRecords property */
    private java.util.List<AlertRecord> _alertRecords;
    /** The alertRules property */
    private java.util.List<AlertRule> _alertRules;
    /**
     * Instantiates a new monitoring and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Monitoring() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagement.monitoring");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a monitoring
     */
    @javax.annotation.Nonnull
    public static Monitoring createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Monitoring();
    }
    /**
     * Gets the alertRecords property value. The alertRecords property
     * @return a alertRecord
     */
    @javax.annotation.Nullable
    public java.util.List<AlertRecord> getAlertRecords() {
        return this._alertRecords;
    }
    /**
     * Gets the alertRules property value. The alertRules property
     * @return a alertRule
     */
    @javax.annotation.Nullable
    public java.util.List<AlertRule> getAlertRules() {
        return this._alertRules;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Monitoring currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("alertRecords", (n) -> { currentObject.setAlertRecords(n.getCollectionOfObjectValues(AlertRecord::createFromDiscriminatorValue)); });
            this.put("alertRules", (n) -> { currentObject.setAlertRules(n.getCollectionOfObjectValues(AlertRule::createFromDiscriminatorValue)); });
        }};
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
        writer.writeCollectionOfObjectValues("alertRecords", this.getAlertRecords());
        writer.writeCollectionOfObjectValues("alertRules", this.getAlertRules());
    }
    /**
     * Sets the alertRecords property value. The alertRecords property
     * @param value Value to set for the alertRecords property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertRecords(@javax.annotation.Nullable final java.util.List<AlertRecord> value) {
        this._alertRecords = value;
    }
    /**
     * Sets the alertRules property value. The alertRules property
     * @param value Value to set for the alertRules property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertRules(@javax.annotation.Nullable final java.util.List<AlertRule> value) {
        this._alertRules = value;
    }
}
