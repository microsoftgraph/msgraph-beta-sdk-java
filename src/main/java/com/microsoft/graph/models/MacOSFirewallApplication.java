package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represents an app in the list of macOS firewall applications */
public class MacOSFirewallApplication implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Whether or not incoming connections are allowed. */
    private Boolean _allowsIncomingConnections;
    /** BundleId of the application. */
    private String _bundleId;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new macOSFirewallApplication and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOSFirewallApplication() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.macOSFirewallApplication");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSFirewallApplication
     */
    @javax.annotation.Nonnull
    public static MacOSFirewallApplication createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSFirewallApplication();
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
     * Gets the allowsIncomingConnections property value. Whether or not incoming connections are allowed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowsIncomingConnections() {
        return this._allowsIncomingConnections;
    }
    /**
     * Gets the bundleId property value. BundleId of the application.
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
        final MacOSFirewallApplication currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("allowsIncomingConnections", (n) -> { currentObject.setAllowsIncomingConnections(n.getBooleanValue()); });
            this.put("bundleId", (n) -> { currentObject.setBundleId(n.getStringValue()); });
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
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowsIncomingConnections", this.getAllowsIncomingConnections());
        writer.writeStringValue("bundleId", this.getBundleId());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the allowsIncomingConnections property value. Whether or not incoming connections are allowed.
     * @param value Value to set for the allowsIncomingConnections property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowsIncomingConnections(@javax.annotation.Nullable final Boolean value) {
        this._allowsIncomingConnections = value;
    }
    /**
     * Sets the bundleId property value. BundleId of the application.
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
}
