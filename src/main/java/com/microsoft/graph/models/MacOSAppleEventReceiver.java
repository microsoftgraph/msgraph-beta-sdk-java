package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represents a process that can receive an Apple Event notification. */
public class MacOSAppleEventReceiver implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Allow or block this app from receiving Apple events. */
    private Boolean _allowed;
    /** Code requirement for the app or binary that receives the Apple Event. */
    private String _codeRequirement;
    /** Bundle ID of the app or file path of the process or executable that receives the Apple Event. */
    private String _identifier;
    /** Process identifier types for MacOS Privacy Preferences */
    private MacOSProcessIdentifierType _identifierType;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new macOSAppleEventReceiver and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOSAppleEventReceiver() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.macOSAppleEventReceiver");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSAppleEventReceiver
     */
    @javax.annotation.Nonnull
    public static MacOSAppleEventReceiver createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSAppleEventReceiver();
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
     * Gets the allowed property value. Allow or block this app from receiving Apple events.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowed() {
        return this._allowed;
    }
    /**
     * Gets the codeRequirement property value. Code requirement for the app or binary that receives the Apple Event.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCodeRequirement() {
        return this._codeRequirement;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MacOSAppleEventReceiver currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(5) {{
            this.put("allowed", (n) -> { currentObject.setAllowed(n.getBooleanValue()); });
            this.put("codeRequirement", (n) -> { currentObject.setCodeRequirement(n.getStringValue()); });
            this.put("identifier", (n) -> { currentObject.setIdentifier(n.getStringValue()); });
            this.put("identifierType", (n) -> { currentObject.setIdentifierType(n.getEnumValue(MacOSProcessIdentifierType.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the identifier property value. Bundle ID of the app or file path of the process or executable that receives the Apple Event.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentifier() {
        return this._identifier;
    }
    /**
     * Gets the identifierType property value. Process identifier types for MacOS Privacy Preferences
     * @return a macOSProcessIdentifierType
     */
    @javax.annotation.Nullable
    public MacOSProcessIdentifierType getIdentifierType() {
        return this._identifierType;
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
        writer.writeBooleanValue("allowed", this.getAllowed());
        writer.writeStringValue("codeRequirement", this.getCodeRequirement());
        writer.writeStringValue("identifier", this.getIdentifier());
        writer.writeEnumValue("identifierType", this.getIdentifierType());
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
     * Sets the allowed property value. Allow or block this app from receiving Apple events.
     * @param value Value to set for the allowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowed(@javax.annotation.Nullable final Boolean value) {
        this._allowed = value;
    }
    /**
     * Sets the codeRequirement property value. Code requirement for the app or binary that receives the Apple Event.
     * @param value Value to set for the codeRequirement property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCodeRequirement(@javax.annotation.Nullable final String value) {
        this._codeRequirement = value;
    }
    /**
     * Sets the identifier property value. Bundle ID of the app or file path of the process or executable that receives the Apple Event.
     * @param value Value to set for the identifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentifier(@javax.annotation.Nullable final String value) {
        this._identifier = value;
    }
    /**
     * Sets the identifierType property value. Process identifier types for MacOS Privacy Preferences
     * @param value Value to set for the identifierType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentifierType(@javax.annotation.Nullable final MacOSProcessIdentifierType value) {
        this._identifierType = value;
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
