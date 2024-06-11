package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OneRosterApiDataConnector extends ApiDataConnector implements Parsable {
    /**
     * Instantiates a new {@link OneRosterApiDataConnector} and sets the default values.
     */
    public OneRosterApiDataConnector() {
        super();
        this.setOdataType("#microsoft.graph.industryData.oneRosterApiDataConnector");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OneRosterApiDataConnector}
     */
    @jakarta.annotation.Nonnull
    public static OneRosterApiDataConnector createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OneRosterApiDataConnector();
    }
    /**
     * Gets the apiVersion property value. The API version of the OneRoster source. Example: 1.1, 1.2
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApiVersion() {
        return this.backingStore.get("apiVersion");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("apiVersion", (n) -> { this.setApiVersion(n.getStringValue()); });
        deserializerMap.put("isContactsEnabled", (n) -> { this.setIsContactsEnabled(n.getBooleanValue()); });
        deserializerMap.put("isDemographicsEnabled", (n) -> { this.setIsDemographicsEnabled(n.getBooleanValue()); });
        deserializerMap.put("isFlagsEnabled", (n) -> { this.setIsFlagsEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isContactsEnabled property value. Indicates whether the user specified to import optional contacts data.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsContactsEnabled() {
        return this.backingStore.get("isContactsEnabled");
    }
    /**
     * Gets the isDemographicsEnabled property value. Indicates whether the user specified to import optional demographics data.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDemographicsEnabled() {
        return this.backingStore.get("isDemographicsEnabled");
    }
    /**
     * Gets the isFlagsEnabled property value. Indicates whether the user specified to import optional flags data.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFlagsEnabled() {
        return this.backingStore.get("isFlagsEnabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("apiVersion", this.getApiVersion());
        writer.writeBooleanValue("isContactsEnabled", this.getIsContactsEnabled());
        writer.writeBooleanValue("isDemographicsEnabled", this.getIsDemographicsEnabled());
        writer.writeBooleanValue("isFlagsEnabled", this.getIsFlagsEnabled());
    }
    /**
     * Sets the apiVersion property value. The API version of the OneRoster source. Example: 1.1, 1.2
     * @param value Value to set for the apiVersion property.
     */
    public void setApiVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("apiVersion", value);
    }
    /**
     * Sets the isContactsEnabled property value. Indicates whether the user specified to import optional contacts data.
     * @param value Value to set for the isContactsEnabled property.
     */
    public void setIsContactsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isContactsEnabled", value);
    }
    /**
     * Sets the isDemographicsEnabled property value. Indicates whether the user specified to import optional demographics data.
     * @param value Value to set for the isDemographicsEnabled property.
     */
    public void setIsDemographicsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDemographicsEnabled", value);
    }
    /**
     * Sets the isFlagsEnabled property value. Indicates whether the user specified to import optional flags data.
     * @param value Value to set for the isFlagsEnabled property.
     */
    public void setIsFlagsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isFlagsEnabled", value);
    }
}
