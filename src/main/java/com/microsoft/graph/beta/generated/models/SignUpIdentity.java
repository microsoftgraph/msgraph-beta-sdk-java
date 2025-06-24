package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SignUpIdentity implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SignUpIdentity} and sets the default values.
     */
    public SignUpIdentity() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SignUpIdentity}
     */
    @jakarta.annotation.Nonnull
    public static SignUpIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SignUpIdentity();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("signUpIdentifier", (n) -> { this.setSignUpIdentifier(n.getStringValue()); });
        deserializerMap.put("signUpIdentifierType", (n) -> { this.setSignUpIdentifierType(n.getEnumValue(SignUpIdentifierType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the signUpIdentifier property value. The identification that the user is trying to utilize to sign up.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSignUpIdentifier() {
        return this.backingStore.get("signUpIdentifier");
    }
    /**
     * Gets the signUpIdentifierType property value. The type of sign-up the user initiated. Possible values include:  emailAddress, unknownFutureValue. Supports $filter (eq) on the emailAddress.
     * @return a {@link SignUpIdentifierType}
     */
    @jakarta.annotation.Nullable
    public SignUpIdentifierType getSignUpIdentifierType() {
        return this.backingStore.get("signUpIdentifierType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("signUpIdentifier", this.getSignUpIdentifier());
        writer.writeEnumValue("signUpIdentifierType", this.getSignUpIdentifierType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the signUpIdentifier property value. The identification that the user is trying to utilize to sign up.
     * @param value Value to set for the signUpIdentifier property.
     */
    public void setSignUpIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("signUpIdentifier", value);
    }
    /**
     * Sets the signUpIdentifierType property value. The type of sign-up the user initiated. Possible values include:  emailAddress, unknownFutureValue. Supports $filter (eq) on the emailAddress.
     * @param value Value to set for the signUpIdentifierType property.
     */
    public void setSignUpIdentifierType(@jakarta.annotation.Nullable final SignUpIdentifierType value) {
        this.backingStore.set("signUpIdentifierType", value);
    }
}
