package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents per-process privacy preferences.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSPrivacyAccessControlItem implements AdditionalDataHolder, Parsable {
    /**
     * Possible values of a property
     */
    private Enablement accessibility;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Possible values of a property
     */
    private Enablement addressBook;
    /**
     * Allow or deny the app or process to send a restricted Apple event to another app or process. You will need to know the identifier, identifier type, and code requirement of the receiving app or process. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<MacOSAppleEventReceiver> appleEventsAllowedReceivers;
    /**
     * Block access to camera app.
     */
    private Boolean blockCamera;
    /**
     * Block the app or process from listening to events from input devices such as mouse, keyboard, and trackpad.Requires macOS 10.15 or later.
     */
    private Boolean blockListenEvent;
    /**
     * Block access to microphone.
     */
    private Boolean blockMicrophone;
    /**
     * Block app from capturing contents of system display. Requires macOS 10.15 or later.
     */
    private Boolean blockScreenCapture;
    /**
     * Possible values of a property
     */
    private Enablement calendar;
    /**
     * Enter the code requirement, which can be obtained with the command 'codesign display -r ' in the Terminal app. Include everything after '=>'.
     */
    private String codeRequirement;
    /**
     * The display name of the app, process, or executable.
     */
    private String displayName;
    /**
     * Possible values of a property
     */
    private Enablement fileProviderPresence;
    /**
     * The bundle ID or path of the app, process, or executable.
     */
    private String identifier;
    /**
     * Process identifier types for MacOS Privacy Preferences
     */
    private MacOSProcessIdentifierType identifierType;
    /**
     * Possible values of a property
     */
    private Enablement mediaLibrary;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Possible values of a property
     */
    private Enablement photos;
    /**
     * Possible values of a property
     */
    private Enablement postEvent;
    /**
     * Possible values of a property
     */
    private Enablement reminders;
    /**
     * Possible values of a property
     */
    private Enablement speechRecognition;
    /**
     * Statically validates the code requirement. Use this setting if the process invalidates its dynamic code signature.
     */
    private Boolean staticCodeValidation;
    /**
     * Possible values of a property
     */
    private Enablement systemPolicyAllFiles;
    /**
     * Possible values of a property
     */
    private Enablement systemPolicyDesktopFolder;
    /**
     * Possible values of a property
     */
    private Enablement systemPolicyDocumentsFolder;
    /**
     * Possible values of a property
     */
    private Enablement systemPolicyDownloadsFolder;
    /**
     * Possible values of a property
     */
    private Enablement systemPolicyNetworkVolumes;
    /**
     * Possible values of a property
     */
    private Enablement systemPolicyRemovableVolumes;
    /**
     * Possible values of a property
     */
    private Enablement systemPolicySystemAdminFiles;
    /**
     * Instantiates a new MacOSPrivacyAccessControlItem and sets the default values.
     */
    public MacOSPrivacyAccessControlItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSPrivacyAccessControlItem
     */
    @jakarta.annotation.Nonnull
    public static MacOSPrivacyAccessControlItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSPrivacyAccessControlItem();
    }
    /**
     * Gets the accessibility property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getAccessibility() {
        return this.accessibility;
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
     * Gets the addressBook property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getAddressBook() {
        return this.addressBook;
    }
    /**
     * Gets the appleEventsAllowedReceivers property value. Allow or deny the app or process to send a restricted Apple event to another app or process. You will need to know the identifier, identifier type, and code requirement of the receiving app or process. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<MacOSAppleEventReceiver>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MacOSAppleEventReceiver> getAppleEventsAllowedReceivers() {
        return this.appleEventsAllowedReceivers;
    }
    /**
     * Gets the blockCamera property value. Block access to camera app.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockCamera() {
        return this.blockCamera;
    }
    /**
     * Gets the blockListenEvent property value. Block the app or process from listening to events from input devices such as mouse, keyboard, and trackpad.Requires macOS 10.15 or later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockListenEvent() {
        return this.blockListenEvent;
    }
    /**
     * Gets the blockMicrophone property value. Block access to microphone.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockMicrophone() {
        return this.blockMicrophone;
    }
    /**
     * Gets the blockScreenCapture property value. Block app from capturing contents of system display. Requires macOS 10.15 or later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockScreenCapture() {
        return this.blockScreenCapture;
    }
    /**
     * Gets the calendar property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getCalendar() {
        return this.calendar;
    }
    /**
     * Gets the codeRequirement property value. Enter the code requirement, which can be obtained with the command 'codesign display -r ' in the Terminal app. Include everything after '=>'.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCodeRequirement() {
        return this.codeRequirement;
    }
    /**
     * Gets the displayName property value. The display name of the app, process, or executable.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(27);
        deserializerMap.put("accessibility", (n) -> { this.setAccessibility(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("addressBook", (n) -> { this.setAddressBook(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("appleEventsAllowedReceivers", (n) -> { this.setAppleEventsAllowedReceivers(n.getCollectionOfObjectValues(MacOSAppleEventReceiver::createFromDiscriminatorValue)); });
        deserializerMap.put("blockCamera", (n) -> { this.setBlockCamera(n.getBooleanValue()); });
        deserializerMap.put("blockListenEvent", (n) -> { this.setBlockListenEvent(n.getBooleanValue()); });
        deserializerMap.put("blockMicrophone", (n) -> { this.setBlockMicrophone(n.getBooleanValue()); });
        deserializerMap.put("blockScreenCapture", (n) -> { this.setBlockScreenCapture(n.getBooleanValue()); });
        deserializerMap.put("calendar", (n) -> { this.setCalendar(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("codeRequirement", (n) -> { this.setCodeRequirement(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("fileProviderPresence", (n) -> { this.setFileProviderPresence(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("identifier", (n) -> { this.setIdentifier(n.getStringValue()); });
        deserializerMap.put("identifierType", (n) -> { this.setIdentifierType(n.getEnumValue(MacOSProcessIdentifierType.class)); });
        deserializerMap.put("mediaLibrary", (n) -> { this.setMediaLibrary(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("photos", (n) -> { this.setPhotos(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("postEvent", (n) -> { this.setPostEvent(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("reminders", (n) -> { this.setReminders(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("speechRecognition", (n) -> { this.setSpeechRecognition(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("staticCodeValidation", (n) -> { this.setStaticCodeValidation(n.getBooleanValue()); });
        deserializerMap.put("systemPolicyAllFiles", (n) -> { this.setSystemPolicyAllFiles(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("systemPolicyDesktopFolder", (n) -> { this.setSystemPolicyDesktopFolder(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("systemPolicyDocumentsFolder", (n) -> { this.setSystemPolicyDocumentsFolder(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("systemPolicyDownloadsFolder", (n) -> { this.setSystemPolicyDownloadsFolder(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("systemPolicyNetworkVolumes", (n) -> { this.setSystemPolicyNetworkVolumes(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("systemPolicyRemovableVolumes", (n) -> { this.setSystemPolicyRemovableVolumes(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("systemPolicySystemAdminFiles", (n) -> { this.setSystemPolicySystemAdminFiles(n.getEnumValue(Enablement.class)); });
        return deserializerMap;
    }
    /**
     * Gets the fileProviderPresence property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getFileProviderPresence() {
        return this.fileProviderPresence;
    }
    /**
     * Gets the identifier property value. The bundle ID or path of the app, process, or executable.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdentifier() {
        return this.identifier;
    }
    /**
     * Gets the identifierType property value. Process identifier types for MacOS Privacy Preferences
     * @return a MacOSProcessIdentifierType
     */
    @jakarta.annotation.Nullable
    public MacOSProcessIdentifierType getIdentifierType() {
        return this.identifierType;
    }
    /**
     * Gets the mediaLibrary property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getMediaLibrary() {
        return this.mediaLibrary;
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
     * Gets the photos property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getPhotos() {
        return this.photos;
    }
    /**
     * Gets the postEvent property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getPostEvent() {
        return this.postEvent;
    }
    /**
     * Gets the reminders property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getReminders() {
        return this.reminders;
    }
    /**
     * Gets the speechRecognition property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getSpeechRecognition() {
        return this.speechRecognition;
    }
    /**
     * Gets the staticCodeValidation property value. Statically validates the code requirement. Use this setting if the process invalidates its dynamic code signature.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStaticCodeValidation() {
        return this.staticCodeValidation;
    }
    /**
     * Gets the systemPolicyAllFiles property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getSystemPolicyAllFiles() {
        return this.systemPolicyAllFiles;
    }
    /**
     * Gets the systemPolicyDesktopFolder property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getSystemPolicyDesktopFolder() {
        return this.systemPolicyDesktopFolder;
    }
    /**
     * Gets the systemPolicyDocumentsFolder property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getSystemPolicyDocumentsFolder() {
        return this.systemPolicyDocumentsFolder;
    }
    /**
     * Gets the systemPolicyDownloadsFolder property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getSystemPolicyDownloadsFolder() {
        return this.systemPolicyDownloadsFolder;
    }
    /**
     * Gets the systemPolicyNetworkVolumes property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getSystemPolicyNetworkVolumes() {
        return this.systemPolicyNetworkVolumes;
    }
    /**
     * Gets the systemPolicyRemovableVolumes property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getSystemPolicyRemovableVolumes() {
        return this.systemPolicyRemovableVolumes;
    }
    /**
     * Gets the systemPolicySystemAdminFiles property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getSystemPolicySystemAdminFiles() {
        return this.systemPolicySystemAdminFiles;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("accessibility", this.getAccessibility());
        writer.writeEnumValue("addressBook", this.getAddressBook());
        writer.writeCollectionOfObjectValues("appleEventsAllowedReceivers", this.getAppleEventsAllowedReceivers());
        writer.writeBooleanValue("blockCamera", this.getBlockCamera());
        writer.writeBooleanValue("blockListenEvent", this.getBlockListenEvent());
        writer.writeBooleanValue("blockMicrophone", this.getBlockMicrophone());
        writer.writeBooleanValue("blockScreenCapture", this.getBlockScreenCapture());
        writer.writeEnumValue("calendar", this.getCalendar());
        writer.writeStringValue("codeRequirement", this.getCodeRequirement());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("fileProviderPresence", this.getFileProviderPresence());
        writer.writeStringValue("identifier", this.getIdentifier());
        writer.writeEnumValue("identifierType", this.getIdentifierType());
        writer.writeEnumValue("mediaLibrary", this.getMediaLibrary());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("photos", this.getPhotos());
        writer.writeEnumValue("postEvent", this.getPostEvent());
        writer.writeEnumValue("reminders", this.getReminders());
        writer.writeEnumValue("speechRecognition", this.getSpeechRecognition());
        writer.writeBooleanValue("staticCodeValidation", this.getStaticCodeValidation());
        writer.writeEnumValue("systemPolicyAllFiles", this.getSystemPolicyAllFiles());
        writer.writeEnumValue("systemPolicyDesktopFolder", this.getSystemPolicyDesktopFolder());
        writer.writeEnumValue("systemPolicyDocumentsFolder", this.getSystemPolicyDocumentsFolder());
        writer.writeEnumValue("systemPolicyDownloadsFolder", this.getSystemPolicyDownloadsFolder());
        writer.writeEnumValue("systemPolicyNetworkVolumes", this.getSystemPolicyNetworkVolumes());
        writer.writeEnumValue("systemPolicyRemovableVolumes", this.getSystemPolicyRemovableVolumes());
        writer.writeEnumValue("systemPolicySystemAdminFiles", this.getSystemPolicySystemAdminFiles());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessibility property value. Possible values of a property
     * @param value Value to set for the accessibility property.
     */
    public void setAccessibility(@jakarta.annotation.Nullable final Enablement value) {
        this.accessibility = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the addressBook property value. Possible values of a property
     * @param value Value to set for the addressBook property.
     */
    public void setAddressBook(@jakarta.annotation.Nullable final Enablement value) {
        this.addressBook = value;
    }
    /**
     * Sets the appleEventsAllowedReceivers property value. Allow or deny the app or process to send a restricted Apple event to another app or process. You will need to know the identifier, identifier type, and code requirement of the receiving app or process. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the appleEventsAllowedReceivers property.
     */
    public void setAppleEventsAllowedReceivers(@jakarta.annotation.Nullable final java.util.List<MacOSAppleEventReceiver> value) {
        this.appleEventsAllowedReceivers = value;
    }
    /**
     * Sets the blockCamera property value. Block access to camera app.
     * @param value Value to set for the blockCamera property.
     */
    public void setBlockCamera(@jakarta.annotation.Nullable final Boolean value) {
        this.blockCamera = value;
    }
    /**
     * Sets the blockListenEvent property value. Block the app or process from listening to events from input devices such as mouse, keyboard, and trackpad.Requires macOS 10.15 or later.
     * @param value Value to set for the blockListenEvent property.
     */
    public void setBlockListenEvent(@jakarta.annotation.Nullable final Boolean value) {
        this.blockListenEvent = value;
    }
    /**
     * Sets the blockMicrophone property value. Block access to microphone.
     * @param value Value to set for the blockMicrophone property.
     */
    public void setBlockMicrophone(@jakarta.annotation.Nullable final Boolean value) {
        this.blockMicrophone = value;
    }
    /**
     * Sets the blockScreenCapture property value. Block app from capturing contents of system display. Requires macOS 10.15 or later.
     * @param value Value to set for the blockScreenCapture property.
     */
    public void setBlockScreenCapture(@jakarta.annotation.Nullable final Boolean value) {
        this.blockScreenCapture = value;
    }
    /**
     * Sets the calendar property value. Possible values of a property
     * @param value Value to set for the calendar property.
     */
    public void setCalendar(@jakarta.annotation.Nullable final Enablement value) {
        this.calendar = value;
    }
    /**
     * Sets the codeRequirement property value. Enter the code requirement, which can be obtained with the command 'codesign display -r ' in the Terminal app. Include everything after '=>'.
     * @param value Value to set for the codeRequirement property.
     */
    public void setCodeRequirement(@jakarta.annotation.Nullable final String value) {
        this.codeRequirement = value;
    }
    /**
     * Sets the displayName property value. The display name of the app, process, or executable.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the fileProviderPresence property value. Possible values of a property
     * @param value Value to set for the fileProviderPresence property.
     */
    public void setFileProviderPresence(@jakarta.annotation.Nullable final Enablement value) {
        this.fileProviderPresence = value;
    }
    /**
     * Sets the identifier property value. The bundle ID or path of the app, process, or executable.
     * @param value Value to set for the identifier property.
     */
    public void setIdentifier(@jakarta.annotation.Nullable final String value) {
        this.identifier = value;
    }
    /**
     * Sets the identifierType property value. Process identifier types for MacOS Privacy Preferences
     * @param value Value to set for the identifierType property.
     */
    public void setIdentifierType(@jakarta.annotation.Nullable final MacOSProcessIdentifierType value) {
        this.identifierType = value;
    }
    /**
     * Sets the mediaLibrary property value. Possible values of a property
     * @param value Value to set for the mediaLibrary property.
     */
    public void setMediaLibrary(@jakarta.annotation.Nullable final Enablement value) {
        this.mediaLibrary = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the photos property value. Possible values of a property
     * @param value Value to set for the photos property.
     */
    public void setPhotos(@jakarta.annotation.Nullable final Enablement value) {
        this.photos = value;
    }
    /**
     * Sets the postEvent property value. Possible values of a property
     * @param value Value to set for the postEvent property.
     */
    public void setPostEvent(@jakarta.annotation.Nullable final Enablement value) {
        this.postEvent = value;
    }
    /**
     * Sets the reminders property value. Possible values of a property
     * @param value Value to set for the reminders property.
     */
    public void setReminders(@jakarta.annotation.Nullable final Enablement value) {
        this.reminders = value;
    }
    /**
     * Sets the speechRecognition property value. Possible values of a property
     * @param value Value to set for the speechRecognition property.
     */
    public void setSpeechRecognition(@jakarta.annotation.Nullable final Enablement value) {
        this.speechRecognition = value;
    }
    /**
     * Sets the staticCodeValidation property value. Statically validates the code requirement. Use this setting if the process invalidates its dynamic code signature.
     * @param value Value to set for the staticCodeValidation property.
     */
    public void setStaticCodeValidation(@jakarta.annotation.Nullable final Boolean value) {
        this.staticCodeValidation = value;
    }
    /**
     * Sets the systemPolicyAllFiles property value. Possible values of a property
     * @param value Value to set for the systemPolicyAllFiles property.
     */
    public void setSystemPolicyAllFiles(@jakarta.annotation.Nullable final Enablement value) {
        this.systemPolicyAllFiles = value;
    }
    /**
     * Sets the systemPolicyDesktopFolder property value. Possible values of a property
     * @param value Value to set for the systemPolicyDesktopFolder property.
     */
    public void setSystemPolicyDesktopFolder(@jakarta.annotation.Nullable final Enablement value) {
        this.systemPolicyDesktopFolder = value;
    }
    /**
     * Sets the systemPolicyDocumentsFolder property value. Possible values of a property
     * @param value Value to set for the systemPolicyDocumentsFolder property.
     */
    public void setSystemPolicyDocumentsFolder(@jakarta.annotation.Nullable final Enablement value) {
        this.systemPolicyDocumentsFolder = value;
    }
    /**
     * Sets the systemPolicyDownloadsFolder property value. Possible values of a property
     * @param value Value to set for the systemPolicyDownloadsFolder property.
     */
    public void setSystemPolicyDownloadsFolder(@jakarta.annotation.Nullable final Enablement value) {
        this.systemPolicyDownloadsFolder = value;
    }
    /**
     * Sets the systemPolicyNetworkVolumes property value. Possible values of a property
     * @param value Value to set for the systemPolicyNetworkVolumes property.
     */
    public void setSystemPolicyNetworkVolumes(@jakarta.annotation.Nullable final Enablement value) {
        this.systemPolicyNetworkVolumes = value;
    }
    /**
     * Sets the systemPolicyRemovableVolumes property value. Possible values of a property
     * @param value Value to set for the systemPolicyRemovableVolumes property.
     */
    public void setSystemPolicyRemovableVolumes(@jakarta.annotation.Nullable final Enablement value) {
        this.systemPolicyRemovableVolumes = value;
    }
    /**
     * Sets the systemPolicySystemAdminFiles property value. Possible values of a property
     * @param value Value to set for the systemPolicySystemAdminFiles property.
     */
    public void setSystemPolicySystemAdminFiles(@jakarta.annotation.Nullable final Enablement value) {
        this.systemPolicySystemAdminFiles = value;
    }
}
