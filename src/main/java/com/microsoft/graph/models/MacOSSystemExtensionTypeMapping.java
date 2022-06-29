package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represents a mapping between team identifiers for macOS system extensions and system extension types. */
public class MacOSSystemExtensionTypeMapping implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Gets or sets the allowed macOS system extension types. Possible values are: driverExtensionsAllowed, networkExtensionsAllowed, endpointSecurityExtensionsAllowed. */
    private MacOSSystemExtensionType _allowedTypes;
    /** Gets or sets the team identifier used to sign the system extension. */
    private String _teamIdentifier;
    /**
     * Instantiates a new macOSSystemExtensionTypeMapping and sets the default values.
     * @return a void
     */
    public MacOSSystemExtensionTypeMapping() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSSystemExtensionTypeMapping
     */
    @javax.annotation.Nonnull
    public static MacOSSystemExtensionTypeMapping createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSSystemExtensionTypeMapping();
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
     * Gets the allowedTypes property value. Gets or sets the allowed macOS system extension types. Possible values are: driverExtensionsAllowed, networkExtensionsAllowed, endpointSecurityExtensionsAllowed.
     * @return a macOSSystemExtensionType
     */
    @javax.annotation.Nullable
    public MacOSSystemExtensionType getAllowedTypes() {
        return this._allowedTypes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MacOSSystemExtensionTypeMapping currentObject = this;
        return new HashMap<>(2) {{
            this.put("allowedTypes", (n) -> { currentObject.setAllowedTypes(n.getEnumValue(MacOSSystemExtensionType.class)); });
            this.put("teamIdentifier", (n) -> { currentObject.setTeamIdentifier(n.getStringValue()); });
        }};
    }
    /**
     * Gets the teamIdentifier property value. Gets or sets the team identifier used to sign the system extension.
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("allowedTypes", this.getAllowedTypes());
        writer.writeStringValue("teamIdentifier", this.getTeamIdentifier());
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
     * Sets the allowedTypes property value. Gets or sets the allowed macOS system extension types. Possible values are: driverExtensionsAllowed, networkExtensionsAllowed, endpointSecurityExtensionsAllowed.
     * @param value Value to set for the allowedTypes property.
     * @return a void
     */
    public void setAllowedTypes(@javax.annotation.Nullable final MacOSSystemExtensionType value) {
        this._allowedTypes = value;
    }
    /**
     * Sets the teamIdentifier property value. Gets or sets the team identifier used to sign the system extension.
     * @param value Value to set for the teamIdentifier property.
     * @return a void
     */
    public void setTeamIdentifier(@javax.annotation.Nullable final String value) {
        this._teamIdentifier = value;
    }
}
