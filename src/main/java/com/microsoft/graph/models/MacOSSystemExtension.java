package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represents a specific macOS system extension. */
public class MacOSSystemExtension implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Gets or sets the bundle identifier of the system extension. */
    private String _bundleId;
    /** The OdataType property */
    private String _odataType;
    /** Gets or sets the team identifier that was used to sign the system extension. */
    private String _teamIdentifier;
    /**
     * Instantiates a new macOSSystemExtension and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOSSystemExtension() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.macOSSystemExtension");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSSystemExtension
     */
    @javax.annotation.Nonnull
    public static MacOSSystemExtension createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSSystemExtension();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the bundleId property value. Gets or sets the bundle identifier of the system extension.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBundleId() {
        return this._bundleId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MacOSSystemExtension currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("bundleId", (n) -> { currentObject.setBundleId(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("teamIdentifier", (n) -> { currentObject.setTeamIdentifier(n.getStringValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the teamIdentifier property value. Gets or sets the team identifier that was used to sign the system extension.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTeamIdentifier() {
        return this._teamIdentifier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("bundleId", this.getBundleId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("teamIdentifier", this.getTeamIdentifier());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the bundleId property value. Gets or sets the bundle identifier of the system extension.
     * @param value Value to set for the bundleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBundleId(@javax.annotation.Nullable final String value) {
        this._bundleId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the teamIdentifier property value. Gets or sets the team identifier that was used to sign the system extension.
     * @param value Value to set for the teamIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamIdentifier(@javax.annotation.Nullable final String value) {
        this._teamIdentifier = value;
    }
}
