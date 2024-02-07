package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationPowerSchoolDataProvider extends EducationSynchronizationDataProvider implements Parsable {
    /**
     * Instantiates a new EducationPowerSchoolDataProvider and sets the default values.
     */
    public EducationPowerSchoolDataProvider() {
        super();
        this.setOdataType("#microsoft.graph.educationPowerSchoolDataProvider");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationPowerSchoolDataProvider
     */
    @jakarta.annotation.Nonnull
    public static EducationPowerSchoolDataProvider createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationPowerSchoolDataProvider();
    }
    /**
     * Gets the allowTeachersInMultipleSchools property value. Indicates whether the source has multiple identifiers for a single student or teacher.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowTeachersInMultipleSchools() {
        return this.backingStore.get("allowTeachersInMultipleSchools");
    }
    /**
     * Gets the clientId property value. The client ID used to connect to PowerSchool.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getClientId() {
        return this.backingStore.get("clientId");
    }
    /**
     * Gets the clientSecret property value. The client secret to authenticate the connection to the PowerSchool instance.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getClientSecret() {
        return this.backingStore.get("clientSecret");
    }
    /**
     * Gets the connectionUrl property value. The connection URL to the PowerSchool instance.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConnectionUrl() {
        return this.backingStore.get("connectionUrl");
    }
    /**
     * Gets the customizations property value. Optional customization to be applied to the synchronization profile.
     * @return a EducationSynchronizationCustomizations
     */
    @jakarta.annotation.Nullable
    public EducationSynchronizationCustomizations getCustomizations() {
        return this.backingStore.get("customizations");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowTeachersInMultipleSchools", (n) -> { this.setAllowTeachersInMultipleSchools(n.getBooleanValue()); });
        deserializerMap.put("clientId", (n) -> { this.setClientId(n.getStringValue()); });
        deserializerMap.put("clientSecret", (n) -> { this.setClientSecret(n.getStringValue()); });
        deserializerMap.put("connectionUrl", (n) -> { this.setConnectionUrl(n.getStringValue()); });
        deserializerMap.put("customizations", (n) -> { this.setCustomizations(n.getObjectValue(EducationSynchronizationCustomizations::createFromDiscriminatorValue)); });
        deserializerMap.put("schoolsIds", (n) -> { this.setSchoolsIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("schoolYear", (n) -> { this.setSchoolYear(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the schoolsIds property value. The list of schools to sync.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSchoolsIds() {
        return this.backingStore.get("schoolsIds");
    }
    /**
     * Gets the schoolYear property value. The school year to sync.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSchoolYear() {
        return this.backingStore.get("schoolYear");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowTeachersInMultipleSchools", this.getAllowTeachersInMultipleSchools());
        writer.writeStringValue("clientId", this.getClientId());
        writer.writeStringValue("clientSecret", this.getClientSecret());
        writer.writeStringValue("connectionUrl", this.getConnectionUrl());
        writer.writeObjectValue("customizations", this.getCustomizations());
        writer.writeCollectionOfPrimitiveValues("schoolsIds", this.getSchoolsIds());
        writer.writeStringValue("schoolYear", this.getSchoolYear());
    }
    /**
     * Sets the allowTeachersInMultipleSchools property value. Indicates whether the source has multiple identifiers for a single student or teacher.
     * @param value Value to set for the allowTeachersInMultipleSchools property.
     */
    public void setAllowTeachersInMultipleSchools(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowTeachersInMultipleSchools", value);
    }
    /**
     * Sets the clientId property value. The client ID used to connect to PowerSchool.
     * @param value Value to set for the clientId property.
     */
    public void setClientId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientId", value);
    }
    /**
     * Sets the clientSecret property value. The client secret to authenticate the connection to the PowerSchool instance.
     * @param value Value to set for the clientSecret property.
     */
    public void setClientSecret(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientSecret", value);
    }
    /**
     * Sets the connectionUrl property value. The connection URL to the PowerSchool instance.
     * @param value Value to set for the connectionUrl property.
     */
    public void setConnectionUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("connectionUrl", value);
    }
    /**
     * Sets the customizations property value. Optional customization to be applied to the synchronization profile.
     * @param value Value to set for the customizations property.
     */
    public void setCustomizations(@jakarta.annotation.Nullable final EducationSynchronizationCustomizations value) {
        this.backingStore.set("customizations", value);
    }
    /**
     * Sets the schoolsIds property value. The list of schools to sync.
     * @param value Value to set for the schoolsIds property.
     */
    public void setSchoolsIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("schoolsIds", value);
    }
    /**
     * Sets the schoolYear property value. The school year to sync.
     * @param value Value to set for the schoolYear property.
     */
    public void setSchoolYear(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("schoolYear", value);
    }
}
