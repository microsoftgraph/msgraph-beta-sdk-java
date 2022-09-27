package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Warranty status entity for a given OEM */
public class OemWarrantyInformationOnboarding extends Entity implements Parsable {
    /** Specifies whether warranty API is available. This property is read-only. */
    private final Boolean _available;
    /** Specifies whether warranty query is enabled for given OEM. This property is read-only. */
    private final Boolean _enabled;
    /** OEM name. This property is read-only. */
    private final String _oemName;
    /**
     * Instantiates a new oemWarrantyInformationOnboarding and sets the default values.
     * @return a void
     */
    public OemWarrantyInformationOnboarding() {
        super();
        this.setOdataType("#microsoft.graph.oemWarrantyInformationOnboarding");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a oemWarrantyInformationOnboarding
     */
    @javax.annotation.Nonnull
    public static OemWarrantyInformationOnboarding createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OemWarrantyInformationOnboarding();
    }
    /**
     * Gets the available property value. Specifies whether warranty API is available. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAvailable() {
        return this._available;
    }
    /**
     * Gets the enabled property value. Specifies whether warranty query is enabled for given OEM. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnabled() {
        return this._enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OemWarrantyInformationOnboarding currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("available", (n) -> { currentObject.setAvailable(n.getBooleanValue()); });
            this.put("enabled", (n) -> { currentObject.setEnabled(n.getBooleanValue()); });
            this.put("oemName", (n) -> { currentObject.setOemName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the oemName property value. OEM name. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOemName() {
        return this._oemName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
    /**
     * Sets the available property value. Specifies whether warranty API is available. This property is read-only.
     * @param value Value to set for the available property.
     * @return a void
     */
    public void setAvailable(@javax.annotation.Nullable final Boolean value) {
        this._available = value;
    }
    /**
     * Sets the enabled property value. Specifies whether warranty query is enabled for given OEM. This property is read-only.
     * @param value Value to set for the enabled property.
     * @return a void
     */
    public void setEnabled(@javax.annotation.Nullable final Boolean value) {
        this._enabled = value;
    }
    /**
     * Sets the oemName property value. OEM name. This property is read-only.
     * @param value Value to set for the oemName property.
     * @return a void
     */
    public void setOemName(@javax.annotation.Nullable final String value) {
        this._oemName = value;
    }
}
