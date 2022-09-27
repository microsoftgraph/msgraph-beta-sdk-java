package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains properties of an included .app in a MacOS app. */
public class MacOSIncludedApp implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The CFBundleIdentifier. */
    private String _bundleId;
    /** The CFBundleVersion. */
    private String _bundleVersion;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new macOSIncludedApp and sets the default values.
     * @return a void
     */
    public MacOSIncludedApp() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.macOSIncludedApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSIncludedApp
     */
    @javax.annotation.Nonnull
    public static MacOSIncludedApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSIncludedApp();
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
     * Gets the bundleId property value. The CFBundleIdentifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBundleId() {
        return this._bundleId;
    }
    /**
     * Gets the bundleVersion property value. The CFBundleVersion.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBundleVersion() {
        return this._bundleVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MacOSIncludedApp currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("bundleId", (n) -> { currentObject.setBundleId(n.getStringValue()); });
            this.put("bundleVersion", (n) -> { currentObject.setBundleVersion(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("bundleId", this.getBundleId());
        writer.writeStringValue("bundleVersion", this.getBundleVersion());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the bundleId property value. The CFBundleIdentifier.
     * @param value Value to set for the bundleId property.
     * @return a void
     */
    public void setBundleId(@javax.annotation.Nullable final String value) {
        this._bundleId = value;
    }
    /**
     * Sets the bundleVersion property value. The CFBundleVersion.
     * @param value Value to set for the bundleVersion property.
     * @return a void
     */
    public void setBundleVersion(@javax.annotation.Nullable final String value) {
        this._bundleVersion = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
