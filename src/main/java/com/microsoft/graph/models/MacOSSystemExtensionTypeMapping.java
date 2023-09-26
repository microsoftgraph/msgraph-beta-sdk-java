package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a mapping between team identifiers for macOS system extensions and system extension types.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSSystemExtensionTypeMapping implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Flag enum representing the allowed macOS system extension types.
     */
    private EnumSet<MacOSSystemExtensionType> allowedTypes;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Gets or sets the team identifier used to sign the system extension.
     */
    private String teamIdentifier;
    /**
     * Instantiates a new MacOSSystemExtensionTypeMapping and sets the default values.
     */
    public MacOSSystemExtensionTypeMapping() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSSystemExtensionTypeMapping
     */
    @jakarta.annotation.Nonnull
    public static MacOSSystemExtensionTypeMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSSystemExtensionTypeMapping();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the allowedTypes property value. Flag enum representing the allowed macOS system extension types.
     * @return a EnumSet<MacOSSystemExtensionType>
     */
    @jakarta.annotation.Nullable
    public EnumSet<MacOSSystemExtensionType> getAllowedTypes() {
        return this.allowedTypes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("allowedTypes", (n) -> { this.setAllowedTypes(n.getEnumSetValue(MacOSSystemExtensionType.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("teamIdentifier", (n) -> { this.setTeamIdentifier(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the teamIdentifier property value. Gets or sets the team identifier used to sign the system extension.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTeamIdentifier() {
        return this.teamIdentifier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumSetValue("allowedTypes", this.getAllowedTypes());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("teamIdentifier", this.getTeamIdentifier());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the allowedTypes property value. Flag enum representing the allowed macOS system extension types.
     * @param value Value to set for the allowedTypes property.
     */
    public void setAllowedTypes(@jakarta.annotation.Nullable final EnumSet<MacOSSystemExtensionType> value) {
        this.allowedTypes = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the teamIdentifier property value. Gets or sets the team identifier used to sign the system extension.
     * @param value Value to set for the teamIdentifier property.
     */
    public void setTeamIdentifier(@jakarta.annotation.Nullable final String value) {
        this.teamIdentifier = value;
    }
}
