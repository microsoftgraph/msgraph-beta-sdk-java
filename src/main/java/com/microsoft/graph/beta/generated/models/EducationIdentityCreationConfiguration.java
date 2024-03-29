package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationIdentityCreationConfiguration extends EducationIdentitySynchronizationConfiguration implements Parsable {
    /**
     * Instantiates a new {@link EducationIdentityCreationConfiguration} and sets the default values.
     */
    public EducationIdentityCreationConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.educationIdentityCreationConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EducationIdentityCreationConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static EducationIdentityCreationConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationIdentityCreationConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("userDomains", (n) -> { this.setUserDomains(n.getCollectionOfObjectValues(EducationIdentityDomain::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the userDomains property value. The userDomains property
     * @return a {@link java.util.List<EducationIdentityDomain>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationIdentityDomain> getUserDomains() {
        return this.backingStore.get("userDomains");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("userDomains", this.getUserDomains());
    }
    /**
     * Sets the userDomains property value. The userDomains property
     * @param value Value to set for the userDomains property.
     */
    public void setUserDomains(@jakarta.annotation.Nullable final java.util.List<EducationIdentityDomain> value) {
        this.backingStore.set("userDomains", value);
    }
}
