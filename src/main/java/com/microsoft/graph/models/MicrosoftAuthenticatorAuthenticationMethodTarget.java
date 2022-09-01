package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MicrosoftAuthenticatorAuthenticationMethodTarget extends AuthenticationMethodTarget implements Parsable {
    /** The authenticationMode property */
    private MicrosoftAuthenticatorAuthenticationMode _authenticationMode;
    /** The displayAppInformationRequiredState property */
    private AdvancedConfigState _displayAppInformationRequiredState;
    /** The numberMatchingRequiredState property */
    private AdvancedConfigState _numberMatchingRequiredState;
    /**
     * Instantiates a new MicrosoftAuthenticatorAuthenticationMethodTarget and sets the default values.
     * @return a void
     */
    public MicrosoftAuthenticatorAuthenticationMethodTarget() {
        super();
        this.setOdataType("#microsoft.graph.microsoftAuthenticatorAuthenticationMethodTarget");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MicrosoftAuthenticatorAuthenticationMethodTarget
     */
    @javax.annotation.Nonnull
    public static MicrosoftAuthenticatorAuthenticationMethodTarget createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftAuthenticatorAuthenticationMethodTarget();
    }
    /**
     * Gets the authenticationMode property value. The authenticationMode property
     * @return a microsoftAuthenticatorAuthenticationMode
     */
    @javax.annotation.Nullable
    public MicrosoftAuthenticatorAuthenticationMode getAuthenticationMode() {
        return this._authenticationMode;
    }
    /**
     * Gets the displayAppInformationRequiredState property value. The displayAppInformationRequiredState property
     * @return a advancedConfigState
     */
    @javax.annotation.Nullable
    public AdvancedConfigState getDisplayAppInformationRequiredState() {
        return this._displayAppInformationRequiredState;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MicrosoftAuthenticatorAuthenticationMethodTarget currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("authenticationMode", (n) -> { currentObject.setAuthenticationMode(n.getEnumValue(MicrosoftAuthenticatorAuthenticationMode.class)); });
            this.put("displayAppInformationRequiredState", (n) -> { currentObject.setDisplayAppInformationRequiredState(n.getEnumValue(AdvancedConfigState.class)); });
            this.put("numberMatchingRequiredState", (n) -> { currentObject.setNumberMatchingRequiredState(n.getEnumValue(AdvancedConfigState.class)); });
        }};
    }
    /**
     * Gets the numberMatchingRequiredState property value. The numberMatchingRequiredState property
     * @return a advancedConfigState
     */
    @javax.annotation.Nullable
    public AdvancedConfigState getNumberMatchingRequiredState() {
        return this._numberMatchingRequiredState;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("authenticationMode", this.getAuthenticationMode());
        writer.writeEnumValue("displayAppInformationRequiredState", this.getDisplayAppInformationRequiredState());
        writer.writeEnumValue("numberMatchingRequiredState", this.getNumberMatchingRequiredState());
    }
    /**
     * Sets the authenticationMode property value. The authenticationMode property
     * @param value Value to set for the authenticationMode property.
     * @return a void
     */
    public void setAuthenticationMode(@javax.annotation.Nullable final MicrosoftAuthenticatorAuthenticationMode value) {
        this._authenticationMode = value;
    }
    /**
     * Sets the displayAppInformationRequiredState property value. The displayAppInformationRequiredState property
     * @param value Value to set for the displayAppInformationRequiredState property.
     * @return a void
     */
    public void setDisplayAppInformationRequiredState(@javax.annotation.Nullable final AdvancedConfigState value) {
        this._displayAppInformationRequiredState = value;
    }
    /**
     * Sets the numberMatchingRequiredState property value. The numberMatchingRequiredState property
     * @param value Value to set for the numberMatchingRequiredState property.
     * @return a void
     */
    public void setNumberMatchingRequiredState(@javax.annotation.Nullable final AdvancedConfigState value) {
        this._numberMatchingRequiredState = value;
    }
}
